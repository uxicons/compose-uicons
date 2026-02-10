package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LocationExclamation: ImageVector? = null

val Icons.Tc.LocationExclamation: ImageVector
    get() = _LocationExclamation ?: UXIcon(name = "LocationExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.5f, 12.5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                close()
                moveTo(12f, 15.25f)
                curveToRelative(-0.41f, 0f, -0.75f, 0.34f, -0.75f, 0.75f)
                reflectiveCurveToRelative(0.34f, 0.75f, 0.75f, 0.75f)
                reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f)
                reflectiveCurveToRelative(-0.34f, -0.75f, -0.75f, -0.75f)
                close()
                moveTo(21.5f, 10.48f)
                curveToRelative(-0.1f, 6.25f, -8.85f, 12.18f, -9.22f, 12.43f)
                curveToRelative(-0.17f, 0.11f, -0.39f, 0.11f, -0.56f, 0f)
                curveToRelative(-1.56f, -1.04f, -9.22f, -6.42f, -9.22f, -12.41f)
                curveToRelative(0.0f, -4.62f, 4.79f, -9.42f, 9.49f, -9.5f)
                horizontalLineToRelative(0.02f)
                curveToRelative(4.73f, 0.07f, 9.35f, 4.67f, 9.49f, 9.48f)
                close()
                moveTo(20.5f, 10.49f)
                curveToRelative(-0.13f, -4.21f, -4.34f, -8.43f, -8.5f, -8.49f)
                curveToRelative(-4.13f, 0.08f, -8.5f, 4.45f, -8.5f, 8.5f)
                curveToRelative(0f, 5.24f, 6.88f, 10.28f, 8.49f, 11.39f)
                curveToRelative(1.48f, -1.05f, 8.42f, -6.28f, 8.51f, -11.4f)
                close()
            }
        }.also { _LocationExclamation = it}
