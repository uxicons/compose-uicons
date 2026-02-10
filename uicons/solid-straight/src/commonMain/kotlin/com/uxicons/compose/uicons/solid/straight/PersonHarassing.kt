package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonHarassing: ImageVector? = null

val Icons.Ss.PersonHarassing: ImageVector
    get() = _PersonHarassing ?: UXIcon(name = "PersonHarassing") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 17f)
                lineTo(10f, 9f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 6f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(8f)
                lineTo(2f, 17f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(2f)
                close()
                moveTo(4f, 2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(14f, 3f)
                horizontalLineToRelative(-3f)
                lineTo(11f, 1f)
                horizontalLineToRelative(3f)
                lineTo(14f, 3f)
                close()
                moveTo(12.25f, 7.36f)
                lineToRelative(-2.6f, -1.61f)
                lineToRelative(1.05f, -1.7f)
                lineToRelative(2.6f, 1.61f)
                lineToRelative(-1.05f, 1.7f)
                close()
                moveTo(23.8f, 17.5f)
                lineToRelative(-2.3f, 4.96f)
                curveToRelative(-0.53f, 1.28f, -2.07f, 1.91f, -3.29f, 1.34f)
                curveToRelative(-1.26f, -0.76f, -4.32f, -5.09f, -4.32f, -5.09f)
                lineToRelative(-2.13f, 5.29f)
                horizontalLineToRelative(-2.16f)
                lineToRelative(3.23f, -8f)
                horizontalLineToRelative(1.47f)
                lineToRelative(2.95f, 3.75f)
                lineToRelative(1.94f, -4.18f)
                curveToRelative(0.55f, -1.29f, 2.02f, -1.89f, 3.29f, -1.35f)
                curveToRelative(1.27f, 0.54f, 1.86f, 2.01f, 1.33f, 3.28f)
                close()
                moveTo(16f, 10.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
            }
        }.also { _PersonHarassing = it}
