package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BowlScoops: ImageVector? = null

val Icons.Ss.BowlScoops: ImageVector
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
                moveTo(0.03f, 11f)
                curveToRelative(0.26f, -3.35f, 3.06f, -6f, 6.47f, -6f)
                curveToRelative(2.32f, 0f, 4.35f, 1.22f, 5.5f, 3.05f)
                curveToRelative(1.15f, -1.83f, 3.18f, -3.05f, 5.5f, -3.05f)
                curveToRelative(3.42f, 0f, 6.22f, 2.65f, 6.47f, 6f)
                lineTo(0.03f, 11f)
                close()
                moveTo(6.53f, 3f)
                curveToRelative(1.16f, -1.8f, 3.18f, -3f, 5.47f, -3f)
                reflectiveCurveToRelative(4.32f, 1.2f, 5.47f, 3f)
                curveToRelative(-2.04f, 0.01f, -3.97f, 0.73f, -5.47f, 2.02f)
                curveToRelative(-1.51f, -1.29f, -3.43f, -2.02f, -5.47f, -2.02f)
                close()
            }
        }.also { _BowlScoops = it}
