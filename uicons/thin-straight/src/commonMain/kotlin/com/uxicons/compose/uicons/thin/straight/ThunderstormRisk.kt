package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThunderstormRisk: ImageVector? = null

val Icons.Ts.ThunderstormRisk: ImageVector
    get() = _ThunderstormRisk ?: UXIcon(name = "ThunderstormRisk") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.5f, 21f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(5.0f, 24f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2.75f)
                lineToRelative(5.25f, -9.01f)
                lineToRelative(5.25f, 9.01f)
                horizontalLineToRelative(-2.75f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4.5f)
                lineToRelative(-7.0f, -11.99f)
                lineToRelative(-7.0f, 11.99f)
                close()
                moveTo(17.0f, 5.02f)
                curveTo(15.87f, 2.0f, 13.0f, 0f, 9.75f, 0f)
                curveTo(5.48f, 0f, 2f, 3.48f, 2f, 7.75f)
                curveToRelative(0f, 0.76f, 0.12f, 1.52f, 0.34f, 2.27f)
                curveToRelative(-1.48f, 1.03f, -2.35f, 2.68f, -2.35f, 4.48f)
                curveToRelative(0f, 2.88f, 2.22f, 5.24f, 5.04f, 5.48f)
                lineToRelative(0.57f, -0.98f)
                curveToRelative(-2.48f, 0f, -4.61f, -2.02f, -4.61f, -4.5f)
                curveToRelative(0f, -1.58f, 0.82f, -3.02f, 2.2f, -3.85f)
                lineToRelative(0.35f, -0.21f)
                lineToRelative(-0.14f, -0.39f)
                curveToRelative(-0.27f, -0.75f, -0.41f, -1.53f, -0.41f, -2.3f)
                curveToRelative(0f, -3.72f, 3.03f, -6.75f, 6.75f, -6.75f)
                curveToRelative(2.93f, 0f, 5.51f, 1.87f, 6.42f, 4.66f)
                lineToRelative(0.11f, 0.34f)
                lineToRelative(0.35f, 0.01f)
                curveToRelative(3.51f, 0.07f, 6.37f, 2.98f, 6.37f, 6.49f)
                curveToRelative(0f, 2.98f, -2.01f, 5.49f, -4.75f, 6.25f)
                lineToRelative(0.52f, 0.89f)
                curveToRelative(3.03f, -0.96f, 5.23f, -3.8f, 5.23f, -7.15f)
                curveToRelative(0f, -3.93f, -3.11f, -7.22f, -7.0f, -7.48f)
                close()
            }
        }.also { _ThunderstormRisk = it}
