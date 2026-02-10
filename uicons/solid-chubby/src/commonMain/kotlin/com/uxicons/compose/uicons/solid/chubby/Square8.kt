package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Square8: ImageVector? = null

val Icons.Sc.Square8: ImageVector
    get() = _Square8 ?: UXIcon(name = "Square8") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 14f)
                curveToRelative(0f, 1.17f, -0.21f, 2f, -3f, 2f)
                reflectiveCurveToRelative(-3f, -0.83f, -3f, -2f)
                reflectiveCurveToRelative(0.21f, -2f, 3f, -2f)
                reflectiveCurveToRelative(3f, 0.83f, 3f, 2f)
                close()
                moveTo(14f, 9f)
                curveToRelative(0f, -0.51f, 0f, -1f, -2f, -1f)
                reflectiveCurveToRelative(-2f, 0.49f, -2f, 1f)
                reflectiveCurveToRelative(0f, 1f, 2f, 1f)
                reflectiveCurveToRelative(2f, -0.49f, 2f, -1f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 4.5f, -0.98f, 9.02f, -1.02f, 9.21f)
                curveToRelative(-0.08f, 0.38f, -0.38f, 0.68f, -0.76f, 0.76f)
                curveToRelative(-0.19f, 0.04f, -4.71f, 1.02f, -9.21f, 1.02f)
                reflectiveCurveToRelative(-9.02f, -0.98f, -9.21f, -1.02f)
                curveToRelative(-0.38f, -0.08f, -0.68f, -0.38f, -0.76f, -0.76f)
                curveToRelative(-0.04f, -0.19f, -1.02f, -4.71f, -1.02f, -9.21f)
                reflectiveCurveToRelative(0.98f, -9.02f, 1.02f, -9.21f)
                curveToRelative(0.08f, -0.38f, 0.38f, -0.68f, 0.76f, -0.76f)
                curveToRelative(0.19f, -0.04f, 4.71f, -1.02f, 9.21f, -1.02f)
                reflectiveCurveToRelative(9.02f, 0.98f, 9.21f, 1.02f)
                curveToRelative(0.38f, 0.08f, 0.68f, 0.38f, 0.76f, 0.76f)
                curveToRelative(0.04f, 0.19f, 1.02f, 4.71f, 1.02f, 9.21f)
                close()
                moveTo(17f, 14f)
                curveToRelative(0f, -1.68f, -0.63f, -2.66f, -1.52f, -3.23f)
                curveToRelative(0.31f, -0.43f, 0.52f, -1.0f, 0.52f, -1.77f)
                curveToRelative(0f, -3f, -3.01f, -3f, -4f, -3f)
                reflectiveCurveToRelative(-4f, 0f, -4f, 3f)
                curveToRelative(0f, 0.77f, 0.2f, 1.34f, 0.52f, 1.77f)
                curveToRelative(-0.89f, 0.57f, -1.52f, 1.55f, -1.52f, 3.23f)
                curveToRelative(0f, 3.58f, 2.85f, 4f, 5f, 4f)
                reflectiveCurveToRelative(5f, -0.41f, 5f, -4f)
                close()
            }
        }.also { _Square8 = it}
