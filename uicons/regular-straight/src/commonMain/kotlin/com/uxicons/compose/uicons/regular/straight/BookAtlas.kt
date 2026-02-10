package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookAtlas: ImageVector? = null

val Icons.Rs.BookAtlas: ImageVector
    get() = _BookAtlas ?: UXIcon(name = "BookAtlas") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20f, 0f)
                lineTo(5f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                lineTo(2f, 21f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                lineTo(22f, 24f)
                lineTo(22f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(5f, 2f)
                horizontalLineToRelative(15f)
                lineTo(20f, 18f)
                lineTo(5f, 18f)
                curveToRelative(-0.35f, 0f, -0.69f, 0.06f, -1f, 0.17f)
                lineTo(4f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(5f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(2f)
                lineTo(5f, 22f)
                close()
                moveTo(14.97f, 9f)
                curveToRelative(-0.05f, -1.15f, -0.21f, -3.02f, -0.7f, -4.54f)
                curveToRelative(1.88f, 0.78f, 3.29f, 2.48f, 3.63f, 4.54f)
                horizontalLineToRelative(-2.94f)
                close()
                moveTo(12.98f, 9f)
                horizontalLineToRelative(-1.95f)
                curveToRelative(0.11f, -2.56f, 0.61f, -4.23f, 0.98f, -4.83f)
                curveToRelative(0.37f, 0.6f, 0.87f, 2.27f, 0.98f, 4.83f)
                close()
                moveTo(14.28f, 15.54f)
                curveToRelative(0.48f, -1.52f, 0.65f, -3.38f, 0.7f, -4.54f)
                horizontalLineToRelative(2.94f)
                curveToRelative(-0.35f, 2.06f, -1.75f, 3.76f, -3.63f, 4.54f)
                close()
                moveTo(6.09f, 11f)
                horizontalLineToRelative(2.94f)
                curveToRelative(0.05f, 1.15f, 0.21f, 3.02f, 0.7f, 4.54f)
                curveToRelative(-1.88f, -0.78f, -3.29f, -2.48f, -3.63f, -4.54f)
                close()
                moveTo(9.03f, 9f)
                horizontalLineToRelative(-2.94f)
                curveToRelative(0.35f, -2.06f, 1.75f, -3.76f, 3.63f, -4.54f)
                curveToRelative(-0.48f, 1.52f, -0.65f, 3.38f, -0.7f, 4.54f)
                close()
                moveTo(12f, 15.83f)
                curveToRelative(-0.37f, -0.6f, -0.87f, -2.27f, -0.98f, -4.83f)
                horizontalLineToRelative(1.95f)
                curveToRelative(-0.11f, 2.56f, -0.61f, 4.23f, -0.98f, 4.83f)
                close()
            }
        }.also { _BookAtlas = it}
