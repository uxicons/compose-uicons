package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FeaturesAlt: ImageVector? = null

val Icons.Rs.FeaturesAlt: ImageVector
    get() = _FeaturesAlt ?: UXIcon(name = "FeaturesAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 16f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-2f)
                close()
                moveTo(24f, 7.59f)
                verticalLineToRelative(16.41f)
                lineTo(4f, 24f)
                verticalLineToRelative(-4.68f)
                lineToRelative(2f, 2f)
                verticalLineToRelative(0.68f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(-7f)
                lineTo(15f, 2f)
                lineTo(7f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2.19f)
                curveToRelative(-0.48f, -0.12f, -0.98f, -0.19f, -1.5f, -0.19f)
                curveToRelative(-0.17f, 0f, -0.34f, 0.01f, -0.5f, 0.02f)
                verticalLineToRelative(-2.02f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(9.41f)
                lineToRelative(7.59f, 7.59f)
                close()
                moveTo(17f, 7f)
                horizontalLineToRelative(3.59f)
                lineToRelative(-3.59f, -3.59f)
                verticalLineToRelative(3.59f)
                close()
                moveTo(19f, 12f)
                horizontalLineToRelative(-8.58f)
                curveToRelative(-0.12f, 0.72f, -0.37f, 1.39f, -0.72f, 2f)
                horizontalLineToRelative(9.3f)
                verticalLineToRelative(-2f)
                close()
                moveTo(2f, 19.49f)
                verticalLineToRelative(-5.37f)
                curveToRelative(-0.91f, -0.73f, -1.5f, -1.86f, -1.5f, -3.12f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                curveToRelative(0f, 1.26f, -0.59f, 2.39f, -1.5f, 3.12f)
                verticalLineToRelative(5.37f)
                lineToRelative(-2.5f, -2.5f)
                lineToRelative(-2.5f, 2.5f)
                close()
                moveTo(2.5f, 11f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                close()
            }
        }.also { _FeaturesAlt = it}
