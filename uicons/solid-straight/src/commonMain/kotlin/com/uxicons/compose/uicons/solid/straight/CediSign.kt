package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CediSign: ImageVector? = null

val Icons.Ss.CediSign: ImageVector
    get() = _CediSign ?: UXIcon(name = "CediSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.18f, 20f)
                horizontalLineToRelative(-0.18f)
                verticalLineTo(4f)
                horizontalLineToRelative(0.18f)
                curveToRelative(2.43f, 0f, 4.62f, 1.35f, 5.7f, 3.54f)
                lineToRelative(1.79f, -0.89f)
                curveToRelative(-1.42f, -2.87f, -4.3f, -4.65f, -7.49f, -4.65f)
                horizontalLineToRelative(-0.18f)
                verticalLineTo(0f)
                horizontalLineToRelative(-2f)
                verticalLineTo(2.02f)
                curveToRelative(-4.44f, 0.19f, -8f, 3.86f, -8f, 8.34f)
                verticalLineToRelative(3.27f)
                curveToRelative(0f, 4.49f, 3.56f, 8.15f, 8f, 8.34f)
                verticalLineToRelative(2.02f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(0.18f)
                curveToRelative(3.14f, 0f, 5.99f, -1.74f, 7.43f, -4.53f)
                lineToRelative(-1.78f, -0.92f)
                curveToRelative(-1.1f, 2.13f, -3.27f, 3.45f, -5.66f, 3.45f)
                close()
                moveTo(5f, 13.64f)
                verticalLineToRelative(-3.27f)
                curveToRelative(0f, -3.39f, 2.66f, -6.15f, 6f, -6.34f)
                verticalLineToRelative(15.96f)
                curveToRelative(-3.34f, -0.19f, -6f, -2.96f, -6f, -6.34f)
                close()
            }
        }.also { _CediSign = it}
