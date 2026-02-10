package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Q: ImageVector? = null

val Icons.Tr.Q: ImageVector
    get() = _Q ?: UXIcon(name = "Q") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 9.91f)
                curveTo(21.5f, -3.22f, 2.5f, -3.21f, 2f, 9.91f)
                verticalLineToRelative(4.18f)
                curveToRelative(-0.12f, 8.52f, 10.57f, 13.09f, 16.72f, 7.33f)
                lineToRelative(2.43f, 2.43f)
                curveToRelative(0.45f, 0.47f, 1.17f, -0.26f, 0.71f, -0.71f)
                lineToRelative(-2.43f, -2.43f)
                curveToRelative(1.6f, -1.76f, 2.57f, -4.08f, 2.57f, -6.63f)
                verticalLineToRelative(-4.18f)
                close()
                moveTo(21f, 14.09f)
                curveToRelative(0f, 2.27f, -0.86f, 4.35f, -2.28f, 5.92f)
                lineToRelative(-3.87f, -3.87f)
                curveToRelative(-0.45f, -0.47f, -1.17f, 0.26f, -0.71f, 0.71f)
                lineToRelative(3.86f, 3.86f)
                curveToRelative(-5.55f, 5.13f, -15.12f, 1.01f, -15.01f, -6.63f)
                verticalLineToRelative(-4.18f)
                curveToRelative(0.45f, -11.8f, 17.55f, -11.8f, 18f, 0f)
                verticalLineToRelative(4.18f)
                close()
            }
        }.also { _Q = it}
