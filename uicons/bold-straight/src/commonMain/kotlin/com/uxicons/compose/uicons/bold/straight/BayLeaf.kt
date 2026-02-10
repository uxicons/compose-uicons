package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BayLeaf: ImageVector? = null

val Icons.Bs.BayLeaf: ImageVector
    get() = _BayLeaf ?: UXIcon(name = "BayLeaf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.88f, 1.43f)
                lineToRelative(-0.14f, -1.17f)
                curveToRelative(-1.47f, -0.16f, -1.35f, -0.23f, -3.74f, -0.26f)
                curveToRelative(-3.42f, 0.0f, -9.48f, 0.63f, -13.43f, 4.57f)
                curveToRelative(-4.83f, 4.83f, -4.69f, 12.79f, -4.52f, 15.25f)
                lineToRelative(-2.05f, 2.05f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(2.05f, -2.05f)
                curveToRelative(0.44f, 0.03f, 1.05f, 0.06f, 1.79f, 0.06f)
                curveToRelative(3.42f, 0f, 9.5f, -0.62f, 13.46f, -4.58f)
                curveToRelative(3.95f, -3.95f, 4.57f, -10.01f, 4.57f, -13.43f)
                curveToRelative(0.0f, -1.46f, -0.11f, -2.44f, -0.12f, -2.57f)
                close()
                moveTo(15f, 3.53f)
                curveToRelative(1.37f, -0.3f, 2.7f, -0.44f, 3.84f, -0.5f)
                lineToRelative(-3.84f, 3.84f)
                close()
                moveTo(10f, 5.62f)
                curveToRelative(0.63f, -0.44f, 1.3f, -0.81f, 2f, -1.11f)
                verticalLineToRelative(5.38f)
                lineToRelative(-2f, 2f)
                verticalLineToRelative(-6.27f)
                close()
                moveTo(7f, 14.88f)
                lineTo(5.03f, 16.85f)
                curveToRelative(0.1f, -2.27f, 0.55f, -5.32f, 1.97f, -7.88f)
                verticalLineToRelative(5.91f)
                close()
                moveTo(7.16f, 18.97f)
                lineTo(9.12f, 17f)
                horizontalLineToRelative(5.9f)
                curveToRelative(-2.56f, 1.42f, -5.59f, 1.86f, -7.87f, 1.97f)
                close()
                moveTo(18.39f, 14f)
                horizontalLineToRelative(-6.27f)
                lineToRelative(2f, -2f)
                horizontalLineToRelative(5.38f)
                curveToRelative(-0.31f, 0.7f, -0.68f, 1.37f, -1.12f, 2f)
                close()
                moveTo(20.48f, 9f)
                horizontalLineToRelative(-3.35f)
                lineToRelative(3.85f, -3.85f)
                curveToRelative(-0.05f, 1.14f, -0.19f, 2.48f, -0.5f, 3.85f)
                close()
            }
        }.also { _BayLeaf = it}
