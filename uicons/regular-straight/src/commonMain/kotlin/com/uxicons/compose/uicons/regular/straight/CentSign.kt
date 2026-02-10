package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CentSign: ImageVector? = null

val Icons.Rs.CentSign: ImageVector
    get() = _CentSign ?: UXIcon(name = "CentSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.84f, 16.55f)
                lineToRelative(1.78f, 0.92f)
                curveToRelative(-1.44f, 2.79f, -4.29f, 4.53f, -7.43f, 4.53f)
                horizontalLineToRelative(-0.18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.02f)
                curveToRelative(-4.44f, -0.19f, -8f, -3.86f, -8f, -8.34f)
                verticalLineToRelative(-3.27f)
                curveTo(3f, 5.87f, 6.56f, 2.21f, 11f, 2.02f)
                verticalLineTo(0f)
                horizontalLineToRelative(2f)
                verticalLineTo(2f)
                horizontalLineToRelative(0.18f)
                curveToRelative(3.2f, 0f, 6.07f, 1.78f, 7.49f, 4.65f)
                lineToRelative(-1.79f, 0.89f)
                curveToRelative(-1.08f, -2.18f, -3.27f, -3.54f, -5.7f, -3.54f)
                horizontalLineToRelative(-1.82f)
                curveToRelative(-3.51f, 0f, -6.36f, 2.85f, -6.36f, 6.36f)
                verticalLineToRelative(3.27f)
                curveToRelative(0f, 3.51f, 2.85f, 6.36f, 6.36f, 6.36f)
                horizontalLineToRelative(1.82f)
                curveToRelative(2.39f, 0f, 4.56f, -1.32f, 5.66f, -3.45f)
                close()
            }
        }.also { _CentSign = it}
