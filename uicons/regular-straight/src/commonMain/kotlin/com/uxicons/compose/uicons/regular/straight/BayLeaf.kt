package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BayLeaf: ImageVector? = null

val Icons.Rs.BayLeaf: ImageVector
    get() = _BayLeaf ?: UXIcon(name = "BayLeaf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.88f, 1.0f)
                lineToRelative(-0.09f, -0.78f)
                lineToRelative(-0.78f, -0.09f)
                curveToRelative(-0.43f, -0.05f, -10.62f, -1.22f, -16.36f, 4.52f)
                curveToRelative(-5.1f, 5.1f, -4.75f, 13.71f, -4.57f, 15.86f)
                lineToRelative(-2.06f, 2.06f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(2.06f, -2.06f)
                curveToRelative(0.46f, 0.04f, 1.2f, 0.08f, 2.13f, 0.08f)
                curveToRelative(3.5f, 0f, 9.71f, -0.63f, 13.73f, -4.65f)
                curveToRelative(5.74f, -5.74f, 4.57f, -15.93f, 4.52f, -16.36f)
                close()
                moveTo(21.18f, 10f)
                horizontalLineToRelative(-5.76f)
                lineToRelative(6.58f, -6.58f)
                curveToRelative(0.01f, 1.68f, -0.14f, 4.12f, -0.82f, 6.58f)
                close()
                moveTo(10.41f, 15f)
                lineTo(13.41f, 12f)
                horizontalLineToRelative(7.08f)
                curveToRelative(-0.44f, 1.06f, -1.0f, 2.08f, -1.73f, 3f)
                close()
                moveTo(9f, 5.24f)
                curveToRelative(0.92f, -0.72f, 1.94f, -1.28f, 3f, -1.73f)
                verticalLineToRelative(7.08f)
                lineToRelative(-3f, 3f)
                close()
                moveTo(20.58f, 2.01f)
                lineTo(14f, 8.59f)
                verticalLineToRelative(-5.76f)
                curveToRelative(2.46f, -0.68f, 4.9f, -0.82f, 6.58f, -0.82f)
                close()
                moveTo(7f, 7.32f)
                verticalLineToRelative(8.27f)
                lineToRelative(-2.99f, 2.99f)
                curveToRelative(-0.01f, -2.8f, 0.4f, -7.7f, 2.99f, -11.26f)
                close()
                moveTo(5.42f, 19.99f)
                lineTo(8.41f, 17f)
                horizontalLineToRelative(8.27f)
                curveToRelative(-3.56f, 2.6f, -8.46f, 3.0f, -11.26f, 2.99f)
                close()
            }
        }.also { _BayLeaf = it}
