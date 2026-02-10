package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BowlScoops: ImageVector? = null

val Icons.Bs.BowlScoops: ImageVector
    get() = _BowlScoops ?: UXIcon(name = "BowlScoops") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 13f)
                lineToRelative(-1.36f, 3.5f)
                curveToRelative(-1.49f, 2.48f, -4.03f, 2.55f, -6.84f, 2.52f)
                curveToRelative(-0.29f, -0.0f, -1.35f, -0.01f, -2.3f, -0.01f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(3f)
                lineTo(7f, 24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-0.94f, 0.0f, -2.01f, 0.01f, -2.3f, 0.01f)
                curveToRelative(-2.82f, 0.04f, -5.35f, -0.03f, -6.84f, -2.52f)
                lineToRelative(-1.36f, -3.5f)
                horizontalLineToRelative(24f)
                close()
                moveTo(3.08f, 11f)
                lineTo(0.04f, 11f)
                curveToRelative(0.32f, -2.87f, 2.44f, -5.2f, 5.2f, -5.83f)
                curveToRelative(0.81f, -2.98f, 3.53f, -5.17f, 6.76f, -5.17f)
                reflectiveCurveToRelative(5.95f, 2.19f, 6.76f, 5.17f)
                curveToRelative(2.76f, 0.63f, 4.88f, 2.96f, 5.2f, 5.83f)
                horizontalLineToRelative(-3.03f)
                curveToRelative(-0.35f, -1.71f, -1.86f, -3f, -3.67f, -3f)
                reflectiveCurveToRelative(-3.33f, 1.29f, -3.67f, 3f)
                horizontalLineToRelative(-3.15f)
                curveToRelative(-0.35f, -1.71f, -1.86f, -3f, -3.67f, -3f)
                reflectiveCurveToRelative(-3.33f, 1.29f, -3.67f, 3f)
                close()
                moveTo(8.42f, 5.21f)
                curveToRelative(1.43f, 0.37f, 2.68f, 1.19f, 3.58f, 2.31f)
                curveToRelative(0.9f, -1.11f, 2.15f, -1.94f, 3.58f, -2.31f)
                curveToRelative(-0.66f, -1.31f, -2.01f, -2.21f, -3.58f, -2.21f)
                reflectiveCurveToRelative(-2.92f, 0.9f, -3.58f, 2.21f)
                close()
            }
        }.also { _BowlScoops = it}
