package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ComplianceDocument: ImageVector? = null

val Icons.Sr.ComplianceDocument: ImageVector
    get() = _ComplianceDocument ?: UXIcon(name = "ComplianceDocument") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 7f)
                lineTo(12f, 0.46f)
                curveToRelative(0.91f, 0.35f, 1.75f, 0.88f, 2.46f, 1.59f)
                lineToRelative(3.48f, 3.49f)
                curveToRelative(0.71f, 0.71f, 1.25f, 1.55f, 1.59f, 2.46f)
                horizontalLineToRelative(-6.54f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(11.15f, 19f)
                horizontalLineToRelative(-6.15f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6.03f)
                curveToRelative(0.17f, -1.28f, 0.94f, -2.39f, 2.07f, -3f)
                horizontalLineToRelative(-0.1f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                lineTo(10f, 0.02f)
                curveToRelative(-0.16f, -0.01f, -0.32f, -0.02f, -0.48f, -0.02f)
                horizontalLineToRelative(-4.51f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(9.48f)
                curveToRelative(-1.39f, -1.12f, -2.86f, -2.78f, -3.33f, -5f)
                close()
                moveTo(19.08f, 23.86f)
                curveToRelative(1.15f, -0.46f, 4.92f, -2.29f, 4.92f, -6.32f)
                verticalLineToRelative(-4.02f)
                curveToRelative(0f, -0.86f, -0.55f, -1.62f, -1.37f, -1.9f)
                lineToRelative(-3.81f, -1.26f)
                curveToRelative(-0.2f, -0.07f, -0.43f, -0.07f, -0.63f, 0f)
                lineToRelative(-3.81f, 1.26f)
                curveToRelative(-0.82f, 0.27f, -1.37f, 1.03f, -1.37f, 1.9f)
                verticalLineToRelative(4.02f)
                curveToRelative(0f, 3.57f, 3.71f, 5.7f, 4.85f, 6.27f)
                curveToRelative(0f, 0f, 0.33f, 0.21f, 0.65f, 0.21f)
                reflectiveCurveToRelative(0.58f, -0.16f, 0.58f, -0.16f)
                close()
            }
        }.also { _ComplianceDocument = it}
