package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CediSign: ImageVector? = null

val Icons.Ts.CediSign: ImageVector
    get() = _CediSign ?: UXIcon(name = "CediSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 21f)
                horizontalLineToRelative(-0.5f)
                lineTo(13f, 3f)
                horizontalLineToRelative(0.5f)
                curveToRelative(2.78f, 0f, 5.28f, 1.55f, 6.52f, 4.04f)
                lineToRelative(0.9f, -0.45f)
                curveToRelative(-1.41f, -2.83f, -4.25f, -4.6f, -7.41f, -4.6f)
                horizontalLineToRelative(-0.5f)
                lineTo(13.01f, 0f)
                horizontalLineToRelative(-1f)
                lineTo(12.01f, 2f)
                horizontalLineToRelative(-0.73f)
                curveTo(6.71f, 2f, 3f, 5.71f, 3f, 10.27f)
                verticalLineToRelative(3.46f)
                curveToRelative(0f, 4.56f, 3.71f, 8.27f, 8.27f, 8.27f)
                horizontalLineToRelative(0.73f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(0.5f)
                curveToRelative(3.11f, 0f, 5.93f, -1.72f, 7.35f, -4.48f)
                lineToRelative(-0.89f, -0.46f)
                curveToRelative(-1.26f, 2.43f, -3.73f, 3.94f, -6.46f, 3.94f)
                close()
                moveTo(11.27f, 21f)
                curveToRelative(-4.01f, 0f, -7.27f, -3.26f, -7.27f, -7.27f)
                verticalLineToRelative(-3.46f)
                curveToRelative(0f, -4.01f, 3.26f, -7.27f, 7.27f, -7.27f)
                horizontalLineToRelative(0.73f)
                lineTo(12f, 21f)
                horizontalLineToRelative(-0.73f)
                close()
            }
        }.also { _CediSign = it}
