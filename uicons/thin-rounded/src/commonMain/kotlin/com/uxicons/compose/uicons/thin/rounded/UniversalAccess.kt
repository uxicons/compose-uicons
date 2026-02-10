package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UniversalAccess: ImageVector? = null

val Icons.Tr.UniversalAccess: ImageVector
    get() = _UniversalAccess ?: UXIcon(name = "UniversalAccess") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(12f, 8f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                close()
                moveTo(12f, 5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(17.3f, 7.04f)
                lineToRelative(-4.4f, 1.96f)
                horizontalLineToRelative(-1.79f)
                lineToRelative(-4.4f, -1.96f)
                curveToRelative(-0.25f, -0.11f, -0.55f, 0f, -0.66f, 0.25f)
                curveToRelative(-0.11f, 0.25f, 0f, 0.55f, 0.25f, 0.66f)
                lineToRelative(3.7f, 1.65f)
                verticalLineToRelative(4.69f)
                lineToRelative(-1.95f, 3.98f)
                curveToRelative(-0.12f, 0.25f, -0.02f, 0.55f, 0.23f, 0.67f)
                curveToRelative(0.07f, 0.03f, 0.15f, 0.05f, 0.22f, 0.05f)
                curveToRelative(0.18f, 0f, 0.36f, -0.1f, 0.45f, -0.28f)
                lineToRelative(1.82f, -3.72f)
                horizontalLineToRelative(2.46f)
                lineToRelative(1.82f, 3.72f)
                curveToRelative(0.09f, 0.18f, 0.26f, 0.28f, 0.45f, 0.28f)
                curveToRelative(0.07f, 0f, 0.15f, -0.02f, 0.22f, -0.05f)
                curveToRelative(0.25f, -0.12f, 0.35f, -0.42f, 0.23f, -0.67f)
                lineToRelative(-1.95f, -3.98f)
                verticalLineToRelative(-4.69f)
                lineToRelative(3.7f, -1.65f)
                curveToRelative(0.25f, -0.11f, 0.37f, -0.41f, 0.25f, -0.66f)
                curveToRelative(-0.11f, -0.25f, -0.41f, -0.37f, -0.66f, -0.25f)
                close()
                moveTo(13f, 10f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _UniversalAccess = it}
