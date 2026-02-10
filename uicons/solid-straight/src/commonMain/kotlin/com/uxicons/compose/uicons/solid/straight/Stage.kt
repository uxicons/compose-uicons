package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stage: ImageVector? = null

val Icons.Ss.Stage: ImageVector
    get() = _Stage ?: UXIcon(name = "Stage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.41f, 22f)
                lineToRelative(-5.41f, -5.41f)
                lineTo(13f, 6.41f)
                lineToRelative(1.59f, -1.59f)
                curveToRelative(0.28f, 0.11f, 0.59f, 0.18f, 0.91f, 0.18f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                curveToRelative(0f, 0.32f, 0.07f, 0.63f, 0.18f, 0.91f)
                lineToRelative(-4.88f, 4.88f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.29f, -1.29f)
                verticalLineToRelative(8.17f)
                lineToRelative(-5.41f, 5.41f)
                lineTo(0f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5.59f)
                close()
                moveTo(12f, 18.41f)
                lineToRelative(3.59f, 3.59f)
                horizontalLineToRelative(-7.17f)
                lineToRelative(3.59f, -3.59f)
                close()
            }
        }.also { _Stage = it}
