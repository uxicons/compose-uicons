package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StudentAlt: ImageVector? = null

val Icons.Ss.StudentAlt: ImageVector
    get() = _StudentAlt ?: UXIcon(name = "StudentAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 5.5f)
                verticalLineToRelative(8.47f)
                lineToRelative(-1.56f, 0.29f)
                curveToRelative(-0.01f, 0.0f, -0.18f, 0.03f, -0.44f, 0.08f)
                verticalLineToRelative(-7.88f)
                lineToRelative(-7.97f, 4.06f)
                curveToRelative(-0.63f, 0.32f, -1.34f, 0.48f, -2.06f, 0.48f)
                reflectiveCurveToRelative(-1.44f, -0.16f, -2.06f, -0.48f)
                lineTo(0.05f, 5.5f)
                lineTo(9.9f, 0.48f)
                curveToRelative(1.25f, -0.64f, 2.87f, -0.64f, 4.12f, 0f)
                lineToRelative(9.97f, 5.02f)
                close()
                moveTo(0f, 17.0f)
                verticalLineToRelative(6.99f)
                lineToRelative(1.19f, -0.23f)
                curveToRelative(0.06f, -0.01f, 5.75f, -1.08f, 9.81f, -1.25f)
                verticalLineToRelative(-4.05f)
                curveToRelative(-4.06f, -0.17f, -9.75f, -1.24f, -9.81f, -1.25f)
                lineToRelative(-1.19f, -0.23f)
                close()
                moveTo(13f, 18.48f)
                verticalLineToRelative(4.05f)
                curveToRelative(4.06f, 0.17f, 9.75f, 1.24f, 9.81f, 1.25f)
                lineToRelative(1.19f, 0.23f)
                verticalLineToRelative(-6.99f)
                lineToRelative(-1.19f, 0.23f)
                curveToRelative(-0.06f, 0.01f, -5.75f, 1.08f, -9.81f, 1.25f)
                close()
                moveTo(19f, 10.23f)
                lineToRelative(-4.06f, 2.07f)
                curveToRelative(-0.9f, 0.46f, -1.92f, 0.7f, -2.97f, 0.7f)
                reflectiveCurveToRelative(-2.08f, -0.24f, -2.97f, -0.7f)
                lineToRelative(-4.0f, -2.04f)
                verticalLineToRelative(5.57f)
                curveToRelative(2.18f, 0.32f, 4.96f, 0.67f, 7f, 0.67f)
                reflectiveCurveToRelative(4.82f, -0.34f, 7f, -0.67f)
                verticalLineToRelative(-5.6f)
                close()
            }
        }.also { _StudentAlt = it}
