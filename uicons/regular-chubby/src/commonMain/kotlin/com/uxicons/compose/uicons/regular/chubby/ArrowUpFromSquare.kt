package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpFromSquare: ImageVector? = null

val Icons.Rc.ArrowUpFromSquare: ImageVector
    get() = _ArrowUpFromSquare ?: UXIcon(name = "ArrowUpFromSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.73f, 7.43f)
                curveToRelative(-0.07f, -0.55f, -0.57f, -0.93f, -1.11f, -0.88f)
                curveToRelative(-0.55f, 0.07f, -0.94f, 0.56f, -0.88f, 1.11f)
                curveToRelative(0.17f, 1.4f, 0.25f, 2.81f, 0.25f, 4.18f)
                curveToRelative(0f, 3.82f, -0.67f, 6.96f, -0.97f, 8.16f)
                curveToRelative(-1.24f, 0.3f, -4.46f, 0.99f, -8.03f, 0.99f)
                reflectiveCurveToRelative(-6.79f, -0.69f, -8.03f, -0.99f)
                curveToRelative(-0.3f, -1.2f, -0.97f, -4.31f, -0.97f, -8.16f)
                curveToRelative(0f, -1.36f, 0.08f, -2.76f, 0.25f, -4.15f)
                curveToRelative(0.07f, -0.55f, -0.33f, -1.05f, -0.88f, -1.11f)
                curveToRelative(-0.54f, -0.06f, -1.05f, 0.33f, -1.11f, 0.88f)
                curveToRelative(-0.17f, 1.47f, -0.26f, 2.95f, -0.26f, 4.39f)
                curveToRelative(0f, 5.25f, 1.14f, 9.11f, 1.19f, 9.28f)
                curveToRelative(0.1f, 0.33f, 0.35f, 0.58f, 0.68f, 0.67f)
                curveToRelative(0.17f, 0.05f, 4.27f, 1.21f, 9.12f, 1.21f)
                reflectiveCurveToRelative(8.95f, -1.16f, 9.12f, -1.21f)
                curveToRelative(0.33f, -0.09f, 0.59f, -0.35f, 0.68f, -0.68f)
                curveToRelative(0.05f, -0.16f, 1.19f, -4.07f, 1.19f, -9.27f)
                curveToRelative(0f, -1.45f, -0.09f, -2.94f, -0.27f, -4.42f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.99f, 8.41f)
                curveToRelative(0.49f, 0.26f, 1.09f, 0.06f, 1.35f, -0.43f)
                curveToRelative(1.16f, -2.23f, 2.62f, -3.56f, 3.67f, -4.29f)
                verticalLineToRelative(12.3f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineTo(3.69f)
                curveToRelative(1.05f, 0.73f, 2.51f, 2.05f, 3.67f, 4.29f)
                curveToRelative(0.18f, 0.34f, 0.7f, 0.74f, 1.35f, 0.43f)
                curveToRelative(0.5f, -0.24f, 0.68f, -0.86f, 0.43f, -1.35f)
                curveTo(16.05f, 2.42f, 12.49f, 1.11f, 12.34f, 1.06f)
                curveToRelative(-0.22f, -0.08f, -0.45f, -0.08f, -0.67f, 0f)
                curveToRelative(-0.15f, 0.05f, -3.71f, 1.37f, -6.11f, 6.0f)
                curveToRelative(-0.25f, 0.49f, -0.06f, 1.09f, 0.43f, 1.35f)
                close()
            }
        }.also { _ArrowUpFromSquare = it}
