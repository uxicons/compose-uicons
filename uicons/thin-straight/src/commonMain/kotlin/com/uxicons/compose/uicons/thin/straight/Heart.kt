package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Heart: ImageVector? = null

val Icons.Ts.Heart: ImageVector
    get() = _Heart ?: UXIcon(name = "Heart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.75f, 1f)
                curveToRelative(-2.5f, 0f, -4.78f, 1.85f, -5.75f, 4.35f)
                curveToRelative(-0.97f, -2.5f, -3.25f, -4.35f, -5.75f, -4.35f)
                curveTo(2.8f, 1f, 0f, 3.8f, 0f, 7.25f)
                curveToRelative(0f, 6.76f, 9.75f, 14.07f, 11.71f, 15.47f)
                lineToRelative(0.29f, 0.21f)
                lineToRelative(0.29f, -0.21f)
                curveToRelative(1.96f, -1.4f, 11.71f, -8.71f, 11.71f, -15.47f)
                curveToRelative(0f, -3.45f, -2.8f, -6.25f, -6.25f, -6.25f)
                close()
                moveTo(12f, 21.69f)
                curveTo(6.86f, 17.96f, 1f, 12.02f, 1f, 7.25f)
                curveTo(1f, 4.36f, 3.35f, 2f, 6.25f, 2f)
                curveToRelative(2.75f, 0f, 5.25f, 2.86f, 5.25f, 6f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -3.14f, 2.5f, -6f, 5.25f, -6f)
                curveToRelative(2.9f, 0f, 5.25f, 2.35f, 5.25f, 5.25f)
                curveToRelative(0f, 4.77f, -5.86f, 10.71f, -11f, 14.44f)
                close()
            }
        }.also { _Heart = it}
