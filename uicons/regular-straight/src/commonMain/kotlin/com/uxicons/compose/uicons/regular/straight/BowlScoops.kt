package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BowlScoops: ImageVector? = null

val Icons.Rs.BowlScoops: ImageVector
    get() = _BowlScoops ?: UXIcon(name = "BowlScoops") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 13f)
                lineToRelative(1.41f, 3.58f)
                curveToRelative(1.38f, 2.21f, 3.7f, 2.42f, 5.91f, 2.42f)
                curveToRelative(0.3f, 0f, 2.65f, 0.01f, 3.68f, 0.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-3.0f)
                curveToRelative(1.02f, 0.0f, 2.46f, 0.01f, 2.8f, 0.01f)
                curveToRelative(2.46f, 0.03f, 5.23f, 0.06f, 6.79f, -2.43f)
                lineToRelative(1.41f, -3.58f)
                lineTo(0f, 13.0f)
                close()
                moveTo(20.84f, 15.6f)
                curveToRelative(-0.87f, 1.32f, -2.28f, 1.45f, -5.02f, 1.42f)
                curveToRelative(-0.5f, -0.01f, -7.15f, -0.01f, -7.65f, 0f)
                curveToRelative(-2.84f, 0.04f, -4.19f, -0.15f, -5.02f, -1.42f)
                lineToRelative(-0.23f, -0.6f)
                horizontalLineToRelative(18.15f)
                lineToRelative(-0.23f, 0.6f)
                close()
                moveTo(6.5f, 7f)
                curveToRelative(2.31f, 0f, 4.2f, 1.76f, 4.45f, 4f)
                horizontalLineToRelative(2.1f)
                curveToRelative(0.25f, -2.24f, 2.14f, -4f, 4.45f, -4f)
                reflectiveCurveToRelative(4.2f, 1.76f, 4.45f, 4f)
                horizontalLineToRelative(2.02f)
                curveToRelative(-0.24f, -3.07f, -2.61f, -5.55f, -5.64f, -5.95f)
                curveToRelative(-0.66f, -2.89f, -3.25f, -5.05f, -6.34f, -5.05f)
                reflectiveCurveToRelative(-5.68f, 2.16f, -6.34f, 5.05f)
                curveTo(2.64f, 5.45f, 0.26f, 7.93f, 0.03f, 11f)
                horizontalLineToRelative(2.02f)
                curveToRelative(0.25f, -2.24f, 2.14f, -4f, 4.45f, -4f)
                close()
                moveTo(12f, 2f)
                curveToRelative(2.0f, 0f, 3.7f, 1.31f, 4.28f, 3.12f)
                curveToRelative(-1.8f, 0.34f, -3.34f, 1.44f, -4.28f, 2.94f)
                curveToRelative(-0.94f, -1.5f, -2.48f, -2.59f, -4.28f, -2.94f)
                curveToRelative(0.58f, -1.81f, 2.28f, -3.12f, 4.28f, -3.12f)
                close()
            }
        }.also { _BowlScoops = it}
