package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Goals: ImageVector? = null

val Icons.Ss.Goals: ImageVector
    get() = _Goals ?: UXIcon(name = "Goals") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 22f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(17f, 24f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(-7f)
                close()
                moveTo(11.26f, 6f)
                lineTo(15f, 4.06f)
                verticalLineToRelative(2.25f)
                lineToRelative(-3.26f, 1.69f)
                horizontalLineToRelative(-2.58f)
                lineToRelative(-1.38f, 5.21f)
                lineToRelative(3.22f, 1.06f)
                verticalLineToRelative(3.72f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2.28f)
                lineToRelative(-3.17f, -1.05f)
                lineToRelative(-1.11f, 3.32f)
                horizontalLineToRelative(-4.72f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3.28f)
                lineToRelative(0.69f, -2.06f)
                curveToRelative(-0.83f, -0.59f, -1.25f, -1.64f, -0.99f, -2.66f)
                lineToRelative(0.9f, -3.35f)
                curveToRelative(0.23f, -1.09f, 1.26f, -1.93f, 2.43f, -1.93f)
                horizontalLineToRelative(4.95f)
                close()
                moveTo(8.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(19f, 6f)
                lineTo(24f, 3f)
                lineTo(19f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _Goals = it}
