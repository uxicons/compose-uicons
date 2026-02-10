package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoothCurtain: ImageVector? = null

val Icons.Bs.BoothCurtain: ImageVector
    get() = _BoothCurtain ?: UXIcon(name = "BoothCurtain") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-12.64f)
                curveToRelative(1.7f, 2.25f, 3.84f, 3.63f, 5.64f, 4.45f)
                curveToRelative(-1.42f, 1.55f, -2.86f, 3.76f, -3.14f, 6.54f)
                lineToRelative(-0.17f, 1.65f)
                horizontalLineToRelative(8.66f)
                lineTo(24.0f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3.5f, 3f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(8f)
                lineTo(3f, 11f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                close()
                moveTo(3f, 21f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(7f)
                lineTo(3f, 21f)
                close()
                moveTo(13.08f, 3f)
                horizontalLineToRelative(2.01f)
                curveToRelative(0.43f, 3.34f, 2.25f, 5.61f, 3.91f, 7.01f)
                verticalLineToRelative(-4.63f)
                curveToRelative(-0.38f, -0.69f, -0.68f, -1.48f, -0.85f, -2.38f)
                horizontalLineToRelative(2.35f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(10.08f)
                curveToRelative(-2.61f, -0.88f, -7.33f, -3.47f, -7.92f, -10.58f)
                close()
                moveTo(21f, 21f)
                horizontalLineToRelative(-2.13f)
                curveToRelative(0.48f, -1.33f, 1.31f, -2.45f, 2.13f, -3.31f)
                verticalLineToRelative(3.31f)
                close()
                moveTo(5f, 16f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _BoothCurtain = it}
