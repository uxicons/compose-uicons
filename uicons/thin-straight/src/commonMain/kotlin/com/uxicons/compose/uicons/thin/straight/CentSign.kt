package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CentSign: ImageVector? = null

val Icons.Ts.CentSign: ImageVector
    get() = _CentSign ?: UXIcon(name = "CentSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.96f, 17.06f)
                lineToRelative(0.89f, 0.46f)
                curveToRelative(-1.43f, 2.76f, -4.25f, 4.48f, -7.35f, 4.48f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-0.73f)
                curveToRelative(-4.56f, 0f, -8.27f, -3.71f, -8.27f, -8.27f)
                verticalLineToRelative(-3.46f)
                curveTo(3f, 5.71f, 6.71f, 2f, 11.27f, 2f)
                horizontalLineToRelative(0.73f)
                verticalLineTo(0f)
                horizontalLineToRelative(1f)
                verticalLineTo(2f)
                horizontalLineToRelative(0.5f)
                curveToRelative(3.16f, 0f, 6f, 1.76f, 7.41f, 4.6f)
                lineToRelative(-0.9f, 0.45f)
                curveToRelative(-1.24f, -2.49f, -3.74f, -4.04f, -6.52f, -4.04f)
                horizontalLineToRelative(-2.23f)
                curveToRelative(-4.01f, 0f, -7.27f, 3.26f, -7.27f, 7.27f)
                verticalLineToRelative(3.46f)
                curveToRelative(0f, 4.01f, 3.26f, 7.27f, 7.27f, 7.27f)
                horizontalLineToRelative(2.23f)
                curveToRelative(2.73f, 0f, 5.21f, -1.51f, 6.46f, -3.94f)
                close()
            }
        }.also { _CentSign = it}
