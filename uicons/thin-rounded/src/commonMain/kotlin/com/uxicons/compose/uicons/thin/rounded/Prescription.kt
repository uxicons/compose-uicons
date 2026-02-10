package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Prescription: ImageVector? = null

val Icons.Tr.Prescription: ImageVector
    get() = _Prescription ?: UXIcon(name = "Prescription") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.77f, 18.5f)
                lineToRelative(3.15f, -4.72f)
                curveToRelative(0.15f, -0.23f, 0.09f, -0.54f, -0.14f, -0.69f)
                curveToRelative(-0.23f, -0.15f, -0.54f, -0.09f, -0.69f, 0.14f)
                lineToRelative(-2.92f, 4.38f)
                lineToRelative(-3.83f, -5.75f)
                curveToRelative(2.67f, -0.61f, 4.67f, -3.0f, 4.67f, -5.85f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                horizontalLineToRelative(-4.5f)
                curveTo(5.02f, 0f, 3f, 2.02f, 3f, 4.5f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-8.5f)
                horizontalLineToRelative(8f)
                curveToRelative(0.08f, 0f, 0.15f, -0.01f, 0.23f, -0.01f)
                lineToRelative(4.34f, 6.51f)
                lineToRelative(-3.15f, 4.72f)
                curveToRelative(-0.15f, 0.23f, -0.09f, 0.54f, 0.14f, 0.69f)
                curveToRelative(0.09f, 0.06f, 0.18f, 0.08f, 0.28f, 0.08f)
                curveToRelative(0.16f, 0f, 0.32f, -0.08f, 0.42f, -0.22f)
                lineToRelative(2.92f, -4.38f)
                lineToRelative(2.92f, 4.38f)
                curveToRelative(0.1f, 0.14f, 0.26f, 0.22f, 0.42f, 0.22f)
                curveToRelative(0.1f, 0f, 0.19f, -0.03f, 0.28f, -0.08f)
                curveToRelative(0.23f, -0.15f, 0.29f, -0.46f, 0.14f, -0.69f)
                lineToRelative(-3.15f, -4.72f)
                close()
                moveTo(4f, 11f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(4.5f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                lineTo(4f, 11f)
                close()
            }
        }.also { _Prescription = it}
