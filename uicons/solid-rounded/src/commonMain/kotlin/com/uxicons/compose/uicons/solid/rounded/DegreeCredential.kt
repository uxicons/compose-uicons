package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DegreeCredential: ImageVector? = null

val Icons.Sr.DegreeCredential: ImageVector
    get() = _DegreeCredential ?: UXIcon(name = "DegreeCredential") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 1.95f)
                lineTo(5f, 1.95f)
                curveTo(2.24f, 1.95f, 0f, 4.19f, 0f, 6.95f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(-2.06f)
                curveToRelative(-0.73f, -0.82f, -1.21f, -1.82f, -1.4f, -2.89f)
                horizontalLineToRelative(-4.1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4.08f)
                curveToRelative(0.12f, -0.72f, 0.35f, -1.39f, 0.7f, -2f)
                horizontalLineToRelative(-4.78f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6.61f)
                curveToRelative(0.96f, -0.66f, 2.13f, -1.05f, 3.39f, -1.05f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                curveToRelative(0f, 1.46f, -0.54f, 2.85f, -1.5f, 3.94f)
                verticalLineToRelative(1.8f)
                curveToRelative(2.02f, -0.64f, 3.5f, -2.51f, 3.5f, -4.75f)
                lineTo(24.0f, 6.95f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(18f, 9f)
                lineTo(6f, 9f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(20f, 16f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                curveToRelative(0f, 1.25f, 0.59f, 2.36f, 1.5f, 3.1f)
                verticalLineToRelative(4.25f)
                curveToRelative(0f, 0.62f, 0.79f, 0.89f, 1.17f, 0.4f)
                lineToRelative(1.33f, -1.74f)
                lineToRelative(1.33f, 1.74f)
                curveToRelative(0.38f, 0.49f, 1.17f, 0.23f, 1.17f, -0.4f)
                verticalLineToRelative(-4.25f)
                curveToRelative(0.91f, -0.73f, 1.5f, -1.84f, 1.5f, -3.1f)
                close()
            }
        }.also { _DegreeCredential = it}
