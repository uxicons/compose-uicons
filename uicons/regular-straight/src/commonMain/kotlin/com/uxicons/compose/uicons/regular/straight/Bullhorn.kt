package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bullhorn: ImageVector? = null

val Icons.Rs.Bullhorn: ImageVector
    get() = _Bullhorn ?: UXIcon(name = "Bullhorn") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 9.5f)
                curveToRelative(0f, -1.21f, -0.86f, -2.22f, -2f, -2.45f)
                lineTo(22f, 0f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, 2.73f, -3.88f, 4f, -6.5f, 4f)
                lineTo(3f, 4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.49f, 1.08f, 2.72f, 2.5f, 2.96f)
                lineToRelative(3.3f, 9.04f)
                horizontalLineToRelative(2.45f)
                curveToRelative(0.94f, 0f, 1.8f, -0.47f, 2.31f, -1.25f)
                curveToRelative(0.51f, -0.78f, 0.59f, -1.76f, 0.23f, -2.56f)
                lineToRelative(-1.95f, -5.19f)
                horizontalLineToRelative(4.66f)
                curveToRelative(2.62f, 0f, 6.5f, 1.27f, 6.5f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7.05f)
                curveToRelative(1.14f, -0.23f, 2f, -1.24f, 2f, -2.45f)
                close()
                moveTo(2f, 12f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(7f)
                lineTo(3f, 13f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(8.93f, 20.94f)
                curveToRelative(0.1f, 0.23f, 0.08f, 0.5f, -0.06f, 0.71f)
                curveToRelative(-0.14f, 0.21f, -0.38f, 0.34f, -0.63f, 0.34f)
                horizontalLineToRelative(-1.05f)
                lineToRelative(-2.55f, -7f)
                horizontalLineToRelative(2.06f)
                lineToRelative(2.23f, 5.94f)
                close()
                moveTo(13.5f, 13f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(4.5f)
                curveToRelative(2.4f, 0f, 4.85f, -0.74f, 6.5f, -2.09f)
                verticalLineToRelative(11.17f)
                curveToRelative(-1.65f, -1.34f, -4.1f, -2.09f, -6.5f, -2.09f)
                close()
            }
        }.also { _Bullhorn = it}
