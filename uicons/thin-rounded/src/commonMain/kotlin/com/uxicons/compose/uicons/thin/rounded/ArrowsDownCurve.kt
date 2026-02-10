package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsDownCurve: ImageVector? = null

val Icons.Tr.ArrowsDownCurve: ImageVector
    get() = _ArrowsDownCurve ?: UXIcon(name = "ArrowsDownCurve") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 23.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(0.5f, 24f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(23.5f, 23f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(23.12f, 15.17f)
                curveToRelative(-0.04f, 0.05f, -4.29f, 4.83f, -11.12f, 4.83f)
                curveToRelative(-6.83f, 0f, -11.08f, -4.78f, -11.12f, -4.83f)
                curveToRelative(-0.18f, -0.21f, -0.5f, -0.23f, -0.71f, -0.05f)
                curveToRelative(-0.21f, 0.18f, -0.23f, 0.5f, -0.05f, 0.7f)
                curveToRelative(0.18f, 0.21f, 4.58f, 5.17f, 11.88f, 5.17f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(0.0f, 0f, 0.0f, 0f)
                horizontalLineToRelative(0f)
                curveToRelative(7.29f, -0.0f, 11.69f, -4.96f, 11.87f, -5.17f)
                curveToRelative(0.18f, -0.21f, 0.16f, -0.52f, -0.05f, -0.7f)
                curveToRelative(-0.21f, -0.18f, -0.52f, -0.16f, -0.7f, 0.05f)
                close()
                moveTo(8.36f, 12.56f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                reflectiveCurveToRelative(-0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(3.3f, 3.3f)
                curveToRelative(0.58f, 0.58f, 1.52f, 0.58f, 2.1f, 0f)
                lineToRelative(3.3f, -3.3f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                reflectiveCurveToRelative(-0.51f, -0.2f, -0.71f, 0f)
                lineToRelative(-3.15f, 3.15f)
                lineToRelative(-0.0f, -8.2f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                lineToRelative(0.0f, 8.2f)
                lineToRelative(-3.15f, -3.15f)
                close()
                moveTo(15.85f, 4.44f)
                lineToRelative(3.15f, -3.15f)
                lineTo(19f, 9.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(20f, 1.3f)
                lineToRelative(3.15f, 3.15f)
                curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0f)
                reflectiveCurveToRelative(0.2f, -0.51f, 0f, -0.71f)
                lineTo(20.55f, 0.43f)
                curveToRelative(-0.58f, -0.58f, -1.52f, -0.58f, -2.1f, 0f)
                lineToRelative(-3.3f, 3.3f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                reflectiveCurveToRelative(0.51f, 0.2f, 0.71f, 0f)
                close()
                moveTo(0.85f, 4.44f)
                lineTo(4f, 1.3f)
                lineTo(4f, 9.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(5f, 1.3f)
                lineToRelative(3.15f, 3.15f)
                curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0f)
                reflectiveCurveToRelative(0.2f, -0.51f, 0f, -0.71f)
                lineTo(5.55f, 0.43f)
                curveTo(4.97f, -0.15f, 4.03f, -0.14f, 3.45f, 0.43f)
                lineTo(0.15f, 3.73f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                reflectiveCurveToRelative(0.51f, 0.2f, 0.71f, 0f)
                close()
            }
        }.also { _ArrowsDownCurve = it}
