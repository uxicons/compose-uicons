package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleDoubleLeft: ImageVector? = null

val Icons.Tr.AngleDoubleLeft: ImageVector
    get() = _AngleDoubleLeft ?: UXIcon(name = "AngleDoubleLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.03f, 23.15f)
                curveToRelative(0.19f, 0.2f, 0.19f, 0.51f, -0.0f, 0.71f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.14f, -0.35f, 0.14f)
                curveToRelative(-0.13f, 0f, -0.26f, -0.05f, -0.35f, -0.15f)
                lineTo(2.02f, 14.47f)
                curveToRelative(-0.66f, -0.66f, -1.02f, -1.54f, -1.02f, -2.47f)
                reflectiveCurveToRelative(0.36f, -1.81f, 1.02f, -2.48f)
                lineTo(11.32f, 0.15f)
                curveToRelative(0.19f, -0.2f, 0.51f, -0.2f, 0.71f, -0.0f)
                curveToRelative(0.2f, 0.19f, 0.2f, 0.51f, 0.0f, 0.71f)
                lineTo(2.73f, 10.23f)
                curveToRelative(-0.47f, 0.47f, -0.73f, 1.1f, -0.73f, 1.77f)
                reflectiveCurveToRelative(0.26f, 1.29f, 0.73f, 1.77f)
                lineToRelative(9.29f, 9.38f)
                close()
                moveTo(12.44f, 13.06f)
                curveToRelative(-0.28f, -0.28f, -0.44f, -0.66f, -0.44f, -1.06f)
                reflectiveCurveToRelative(0.16f, -0.78f, 0.44f, -1.06f)
                lineTo(22.36f, 0.85f)
                curveToRelative(0.19f, -0.2f, 0.19f, -0.51f, -0.01f, -0.71f)
                curveToRelative(-0.2f, -0.19f, -0.51f, -0.19f, -0.71f, 0.01f)
                lineToRelative(-9.91f, 10.08f)
                curveToRelative(-0.47f, 0.47f, -0.73f, 1.1f, -0.73f, 1.77f)
                reflectiveCurveToRelative(0.26f, 1.3f, 0.73f, 1.76f)
                lineToRelative(9.91f, 10.09f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.36f, 0.15f)
                curveToRelative(0.13f, 0f, 0.25f, -0.05f, 0.35f, -0.14f)
                curveToRelative(0.2f, -0.19f, 0.2f, -0.51f, 0.01f, -0.71f)
                lineToRelative(-9.92f, -10.09f)
                close()
            }
        }.also { _AngleDoubleLeft = it}
