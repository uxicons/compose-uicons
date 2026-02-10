package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScannerImage: ImageVector? = null

val Icons.Sc.ScannerImage: ImageVector
    get() = _ScannerImage ?: UXIcon(name = "ScannerImage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.46f, 14.3f)
                curveToRelative(-0.1f, -0.17f, -0.14f, -0.37f, -0.29f, -0.53f)
                curveToRelative(-3.89f, -4.92f, -9.77f, -9.17f, -16.13f, -11.66f)
                curveToRelative(-0.77f, -0.3f, -1.64f, 0.08f, -1.95f, 0.85f)
                reflectiveCurveToRelative(0.08f, 1.64f, 0.85f, 1.95f)
                curveToRelative(4.79f, 1.88f, 9.26f, 4.84f, 12.69f, 8.31f)
                curveToRelative(-1.48f, -0.12f, -3.35f, -0.2f, -5.64f, -0.2f)
                curveToRelative(-6.4f, 0f, -9.63f, 0.69f, -9.76f, 0.72f)
                curveToRelative(-0.31f, 0.07f, -0.57f, 0.28f, -0.7f, 0.58f)
                curveToRelative(-0.06f, 0.13f, -0.54f, 1.29f, -0.54f, 3.2f)
                reflectiveCurveToRelative(0.48f, 3.07f, 0.54f, 3.2f)
                curveToRelative(0.13f, 0.29f, 0.39f, 0.51f, 0.7f, 0.58f)
                curveToRelative(0.13f, 0.03f, 3.36f, 0.72f, 9.76f, 0.72f)
                reflectiveCurveToRelative(9.63f, -0.69f, 9.76f, -0.72f)
                curveToRelative(0.31f, -0.07f, 0.57f, -0.28f, 0.7f, -0.58f)
                curveToRelative(0.06f, -0.13f, 0.54f, -1.29f, 0.54f, -3.2f)
                reflectiveCurveToRelative(-0.48f, -3.07f, -0.54f, -3.2f)
                close()
                moveTo(5.5f, 19f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(9.5f, 19f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _ScannerImage = it}
