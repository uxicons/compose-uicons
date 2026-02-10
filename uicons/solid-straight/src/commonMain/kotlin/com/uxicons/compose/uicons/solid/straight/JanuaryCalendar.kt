package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _JanuaryCalendar: ImageVector? = null

val Icons.Ss.JanuaryCalendar: ImageVector
    get() = _JanuaryCalendar ?: UXIcon(name = "JanuaryCalendar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 16f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-1.6f)
                lineToRelative(-1.8f, -4.05f)
                verticalLineToRelative(4.05f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(0.01f)
                lineToRelative(1.8f, 4.05f)
                verticalLineToRelative(-4.06f)
                close()
                moveTo(16.17f, 22.6f)
                horizontalLineToRelative(-2.38f)
                lineToRelative(-0.31f, 1.4f)
                horizontalLineToRelative(-1.58f)
                lineToRelative(1.36f, -6.42f)
                curveToRelative(0.17f, -0.86f, 0.87f, -1.58f, 1.74f, -1.58f)
                curveToRelative(0.89f, 0.01f, 1.56f, 0.69f, 1.75f, 1.63f)
                lineToRelative(1.34f, 6.37f)
                horizontalLineToRelative(-1.63f)
                lineToRelative(-0.29f, -1.4f)
                close()
                moveTo(15.83f, 21f)
                lineTo(15.19f, 17.96f)
                curveToRelative(-0.05f, -0.23f, -0.14f, -0.33f, -0.17f, -0.35f)
                lineToRelative(-0.02f, -0.01f)
                curveToRelative(-0.07f, 0.04f, -0.15f, 0.15f, -0.18f, 0.3f)
                lineToRelative(-0.69f, 3.1f)
                horizontalLineToRelative(1.69f)
                close()
                moveTo(9.4f, 16f)
                verticalLineToRelative(5.7f)
                curveToRelative(0f, 0.39f, -0.31f, 0.7f, -0.7f, 0.7f)
                reflectiveCurveToRelative(-0.7f, -0.31f, -0.7f, -0.7f)
                verticalLineToRelative(-0.7f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(0.7f)
                curveToRelative(0f, 1.27f, 1.03f, 2.3f, 2.3f, 2.3f)
                reflectiveCurveToRelative(2.3f, -1.03f, 2.3f, -2.3f)
                verticalLineToRelative(-5.7f)
                close()
                moveTo(24.0f, 8f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(24f)
                close()
                moveTo(0f, 10f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(5.16f)
                curveToRelative(-0.37f, -0.59f, -0.6f, -1.27f, -0.66f, -2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(16.5f)
                verticalLineToRelative(-4f)
                close()
            }
        }.also { _JanuaryCalendar = it}
