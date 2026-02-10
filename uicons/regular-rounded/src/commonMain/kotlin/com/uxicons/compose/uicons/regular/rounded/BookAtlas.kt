package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookAtlas: ImageVector? = null

val Icons.Rr.BookAtlas: ImageVector
    get() = _BookAtlas ?: UXIcon(name = "BookAtlas") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 0f)
                lineTo(7f, 0f)
                curveTo(4.24f, 0f, 2f, 2.24f, 2f, 5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(11f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(22f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(7f, 2f)
                horizontalLineToRelative(10f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(11f)
                lineTo(6f, 16f)
                curveToRelative(-0.73f, 0f, -1.41f, 0.2f, -2f, 0.54f)
                lineTo(4f, 5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                close()
                moveTo(17f, 22f)
                lineTo(6f, 22f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
                moveTo(14.61f, 13.33f)
                curveToRelative(0.25f, -1.22f, 0.35f, -2.47f, 0.39f, -3.33f)
                horizontalLineToRelative(2.94f)
                curveToRelative(-0.27f, 1.6f, -1.18f, 2.98f, -2.45f, 3.88f)
                curveToRelative(-0.41f, 0.29f, -0.98f, -0.06f, -0.88f, -0.55f)
                close()
                moveTo(13f, 8f)
                horizontalLineToRelative(-1.95f)
                curveToRelative(0.11f, -2.56f, 0.42f, -4.83f, 0.98f, -4.83f)
                reflectiveCurveToRelative(0.87f, 2.27f, 0.98f, 4.83f)
                close()
                moveTo(14.61f, 4.67f)
                curveToRelative(-0.1f, -0.49f, 0.47f, -0.84f, 0.88f, -0.55f)
                curveToRelative(1.27f, 0.9f, 2.18f, 2.28f, 2.45f, 3.88f)
                horizontalLineToRelative(-2.94f)
                curveToRelative(-0.04f, -0.86f, -0.14f, -2.12f, -0.39f, -3.33f)
                close()
                moveTo(6.11f, 10f)
                horizontalLineToRelative(2.94f)
                curveToRelative(0.04f, 0.86f, 0.14f, 2.12f, 0.39f, 3.33f)
                curveToRelative(0.1f, 0.49f, -0.47f, 0.84f, -0.88f, 0.55f)
                curveToRelative(-1.27f, -0.9f, -2.18f, -2.28f, -2.45f, -3.88f)
                close()
                moveTo(9.05f, 8f)
                horizontalLineToRelative(-2.94f)
                curveToRelative(0.27f, -1.6f, 1.18f, -2.98f, 2.45f, -3.88f)
                curveToRelative(0.41f, -0.29f, 0.98f, 0.06f, 0.88f, 0.55f)
                curveToRelative(-0.25f, 1.22f, -0.35f, 2.47f, -0.39f, 3.33f)
                close()
                moveTo(11.05f, 10f)
                horizontalLineToRelative(1.95f)
                curveToRelative(-0.11f, 2.56f, -0.43f, 4.83f, -0.98f, 4.83f)
                reflectiveCurveToRelative(-0.87f, -2.27f, -0.98f, -4.83f)
                close()
            }
        }.also { _BookAtlas = it}
