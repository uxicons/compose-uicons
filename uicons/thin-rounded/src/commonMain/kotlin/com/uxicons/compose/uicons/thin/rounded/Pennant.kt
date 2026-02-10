package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pennant: ImageVector? = null

val Icons.Tr.Pennant: ImageVector
    get() = _Pennant ?: UXIcon(name = "Pennant") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.28f, 10.12f)
                lineTo(4.05f, 4.46f)
                curveToRelative(0.58f, -0.46f, 0.95f, -1.17f, 0.95f, -1.96f)
                curveTo(5f, 1.12f, 3.88f, 0f, 2.5f, 0f)
                reflectiveCurveTo(0f, 1.12f, 0f, 2.5f)
                curveToRelative(0f, 1.21f, 0.86f, 2.22f, 2f, 2.45f)
                verticalLineTo(23.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-2.63f)
                lineToRelative(19.29f, -6.0f)
                curveToRelative(1.04f, -0.35f, 1.71f, -1.28f, 1.71f, -2.37f)
                reflectiveCurveToRelative(-0.67f, -2.02f, -1.72f, -2.38f)
                close()
                moveTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(21.98f, 13.92f)
                lineTo(3f, 19.82f)
                verticalLineTo(5.18f)
                lineToRelative(18.98f, 5.9f)
                curveToRelative(0.76f, 0.25f, 1.02f, 0.9f, 1.02f, 1.42f)
                reflectiveCurveToRelative(-0.27f, 1.17f, -1.02f, 1.42f)
                close()
            }
        }.also { _Pennant = it}
