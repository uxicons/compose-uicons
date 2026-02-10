package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Peace: ImageVector? = null

val Icons.Tc.Peace: ImageVector
    get() = _Peace ?: UXIcon(name = "Peace") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.81f, 0f, -11f, 3.19f, -11f, 11f)
                reflectiveCurveToRelative(3.19f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.19f, 11f, -11f)
                reflectiveCurveToRelative(-3.19f, -11f, -11f, -11f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, 2.44f, -0.33f, 4.36f, -1.04f, 5.85f)
                curveToRelative(-3.24f, -5.1f, -7.37f, -7.64f, -8.46f, -8.25f)
                verticalLineToRelative(-7.59f)
                curveToRelative(6.82f, 0.13f, 9.5f, 2.96f, 9.5f, 9.99f)
                close()
                moveTo(11.5f, 2.01f)
                verticalLineToRelative(7.59f)
                curveToRelative(-1.1f, 0.61f, -5.23f, 3.14f, -8.47f, 8.23f)
                curveToRelative(-0.7f, -1.49f, -1.03f, -3.41f, -1.03f, -5.83f)
                curveToRelative(0f, -7.02f, 2.68f, -9.86f, 9.5f, -9.99f)
                close()
                moveTo(3.59f, 18.82f)
                curveToRelative(2.76f, -4.55f, 6.39f, -7.11f, 7.91f, -8.05f)
                verticalLineToRelative(11.22f)
                curveToRelative(-3.9f, -0.08f, -6.45f, -1.04f, -7.91f, -3.17f)
                close()
                moveTo(12.5f, 21.99f)
                verticalLineToRelative(-11.22f)
                curveToRelative(1.52f, 0.94f, 5.14f, 3.51f, 7.9f, 8.07f)
                curveToRelative(-1.46f, 2.12f, -4.01f, 3.08f, -7.9f, 3.15f)
                close()
            }
        }.also { _Peace = it}
