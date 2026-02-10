package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LocationArrow: ImageVector? = null

val Icons.Rs.LocationArrow: ImageVector
    get() = _LocationArrow ?: UXIcon(name = "LocationArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.89f, 8.44f)
                curveToRelative(-1.33f, 0.48f, -2.08f, 1.79f, -1.84f, 3.19f)
                curveToRelative(0.24f, 1.4f, 1.41f, 2.37f, 2.83f, 2.37f)
                horizontalLineToRelative(7.13f)
                verticalLineToRelative(7.13f)
                curveToRelative(0f, 1.42f, 0.98f, 2.58f, 2.37f, 2.83f)
                curveToRelative(0.17f, 0.03f, 0.35f, 0.05f, 0.52f, 0.05f)
                curveToRelative(1.19f, 0f, 2.25f, -0.73f, 2.67f, -1.88f)
                lineTo(24.03f, -0.01f)
                lineTo(1.89f, 8.44f)
                close()
                moveTo(13.69f, 21.43f)
                curveToRelative(-0.23f, 0.64f, -0.8f, 0.59f, -0.97f, 0.56f)
                curveToRelative(-0.17f, -0.03f, -0.72f, -0.18f, -0.72f, -0.86f)
                verticalLineToRelative(-9.13f)
                lineTo(2.87f, 12.0f)
                curveToRelative(-0.68f, 0f, -0.83f, -0.55f, -0.86f, -0.72f)
                curveToRelative(-0.03f, -0.17f, -0.08f, -0.74f, 0.56f, -0.97f)
                lineTo(20.56f, 3.45f)
                lineToRelative(-6.88f, 17.98f)
                close()
            }
        }.also { _LocationArrow = it}
