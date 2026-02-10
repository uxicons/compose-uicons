package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bullhorn: ImageVector? = null

val Icons.Bs.Bullhorn: ImageVector
    get() = _Bullhorn ?: UXIcon(name = "Bullhorn") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 9.5f)
                curveToRelative(0f, -1.21f, -0.86f, -2.22f, -2f, -2.45f)
                lineTo(22f, 0f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, 2.12f, -3.63f, 4f, -6.5f, 4f)
                lineTo(3.5f, 4f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.7f, 1.22f, 3.12f, 2.82f, 3.43f)
                lineToRelative(4.03f, 9.07f)
                horizontalLineToRelative(1.4f)
                curveToRelative(0.94f, 0f, 1.8f, -0.47f, 2.31f, -1.25f)
                curveToRelative(0.51f, -0.78f, 0.59f, -1.76f, 0.21f, -2.62f)
                lineToRelative(-2.28f, -5.13f)
                horizontalLineToRelative(4.02f)
                curveToRelative(2.87f, 0f, 6.5f, 1.88f, 6.5f, 4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-7.05f)
                curveToRelative(1.14f, -0.23f, 2f, -1.24f, 2f, -2.45f)
                close()
                moveTo(3f, 7.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-4f)
                close()
                moveTo(12.5f, 12f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(2.08f, 0f, 4.58f, -0.73f, 6.5f, -2.05f)
                verticalLineToRelative(9.1f)
                curveToRelative(-1.92f, -1.32f, -4.42f, -2.05f, -6.5f, -2.05f)
                close()
            }
        }.also { _Bullhorn = it}
