package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _License: ImageVector? = null

val Icons.Ss.License: ImageVector
    get() = _License ?: UXIcon(name = "License") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.41f, 5f)
                horizontalLineToRelative(-4.41f)
                lineTo(17f, 0.59f)
                lineToRelative(4.41f, 4.41f)
                close()
                moveTo(18f, 16f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                curveToRelative(0f, 1.47f, 0.81f, 2.75f, 2f, 3.44f)
                verticalLineToRelative(4.56f)
                lineToRelative(2f, -2f)
                lineToRelative(2f, 2f)
                verticalLineToRelative(-4.56f)
                curveToRelative(1.19f, -0.69f, 2f, -1.97f, 2f, -3.44f)
                close()
                moveTo(15f, 7f)
                lineTo(15f, 0f)
                lineTo(5f, 0f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                lineTo(2f, 24f)
                lineTo(10f, 24f)
                verticalLineToRelative(-3.54f)
                curveToRelative(-1.22f, -1.1f, -2f, -2.69f, -2f, -4.46f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                curveToRelative(0f, 1.77f, -0.78f, 3.36f, -2f, 4.46f)
                verticalLineToRelative(3.54f)
                horizontalLineToRelative(4f)
                lineTo(22f, 7f)
                horizontalLineToRelative(-7f)
                close()
            }
        }.also { _License = it}
