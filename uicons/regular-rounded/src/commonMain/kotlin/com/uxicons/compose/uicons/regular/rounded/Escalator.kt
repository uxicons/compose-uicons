package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Escalator: ImageVector? = null

val Icons.Rr.Escalator: ImageVector
    get() = _Escalator ?: UXIcon(name = "Escalator") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(24f, 8.95f)
                curveToRelative(0f, 2.16f, -1.59f, 3.87f, -3.62f, 4.03f)
                lineToRelative(-11.34f, 9.59f)
                curveToRelative(-1.08f, 0.92f, -2.46f, 1.42f, -3.88f, 1.42f)
                horizontalLineToRelative(-1.22f)
                curveToRelative(-2.18f, 0f, -3.95f, -1.77f, -3.95f, -3.95f)
                curveToRelative(0f, -2.16f, 1.59f, -3.87f, 3.62f, -4.03f)
                lineToRelative(1.38f, -1.17f)
                verticalLineToRelative(-5.34f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                curveToRelative(1.75f, 0f, 3.2f, 1.28f, 3.46f, 2.96f)
                lineToRelative(3.0f, -2.54f)
                curveToRelative(1.08f, -0.92f, 2.46f, -1.42f, 3.88f, -1.42f)
                horizontalLineToRelative(1.22f)
                curveToRelative(2.18f, 0f, 3.95f, 1.77f, 3.95f, 3.95f)
                close()
                moveTo(7f, 13.15f)
                lineToRelative(3f, -2.54f)
                verticalLineToRelative(-1.11f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(3.65f)
                close()
                moveTo(22f, 9.05f)
                curveToRelative(0f, -1.17f, -0.88f, -2.05f, -1.95f, -2.05f)
                horizontalLineToRelative(-1.22f)
                curveToRelative(-0.94f, 0f, -1.86f, 0.34f, -2.58f, 0.95f)
                lineToRelative(-11.6f, 9.82f)
                curveToRelative(-0.18f, 0.15f, -0.41f, 0.24f, -0.65f, 0.24f)
                curveToRelative(-1.12f, 0f, -2f, 0.88f, -2f, 1.95f)
                curveToRelative(0f, 1.17f, 0.88f, 2.05f, 1.95f, 2.05f)
                horizontalLineToRelative(1.22f)
                curveToRelative(0.94f, 0f, 1.86f, -0.34f, 2.58f, -0.95f)
                lineToRelative(11.6f, -9.82f)
                curveToRelative(0.18f, -0.15f, 0.41f, -0.24f, 0.65f, -0.24f)
                curveToRelative(1.12f, 0f, 2f, -0.88f, 2f, -1.95f)
                close()
            }
        }.also { _Escalator = it}
