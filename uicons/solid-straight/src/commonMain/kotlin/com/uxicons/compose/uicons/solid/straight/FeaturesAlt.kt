package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FeaturesAlt: ImageVector? = null

val Icons.Ss.FeaturesAlt: ImageVector
    get() = _FeaturesAlt ?: UXIcon(name = "FeaturesAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 19.49f)
                verticalLineToRelative(-5.37f)
                curveToRelative(-0.91f, -0.73f, -1.5f, -1.86f, -1.5f, -3.12f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                curveToRelative(0f, 1.26f, -0.59f, 2.39f, -1.5f, 3.12f)
                verticalLineToRelative(5.37f)
                lineToRelative(-2.5f, -2.5f)
                lineToRelative(-2.5f, 2.5f)
                close()
                moveTo(19f, 0.59f)
                verticalLineToRelative(4.41f)
                horizontalLineToRelative(4.41f)
                lineTo(19f, 0.59f)
                close()
                moveTo(17f, 7f)
                lineTo(17f, 0f)
                lineTo(7f, 0f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(2.02f)
                curveToRelative(0.17f, -0.01f, 0.33f, -0.02f, 0.5f, -0.02f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                curveToRelative(0f, 0.34f, -0.03f, 0.68f, -0.08f, 1f)
                horizontalLineToRelative(8.58f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-9.3f)
                curveToRelative(-0.2f, 0.34f, -0.43f, 0.67f, -0.69f, 0.96f)
                verticalLineToRelative(1.04f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3.32f)
                lineToRelative(-1.68f, -1.68f)
                verticalLineToRelative(4.68f)
                horizontalLineToRelative(20f)
                lineTo(24f, 7f)
                horizontalLineToRelative(-7f)
                close()
            }
        }.also { _FeaturesAlt = it}
