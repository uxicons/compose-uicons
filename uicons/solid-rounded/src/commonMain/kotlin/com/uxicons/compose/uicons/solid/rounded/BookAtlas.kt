package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookAtlas: ImageVector? = null

val Icons.Sr.BookAtlas: ImageVector
    get() = _BookAtlas ?: UXIcon(name = "BookAtlas") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 18f)
                lineTo(22f, 18f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 24f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                close()
                moveTo(22f, 5f)
                verticalLineToRelative(11f)
                lineTo(5f, 16f)
                curveToRelative(-0.2f, 0f, -0.41f, 0.02f, -0.6f, 0.06f)
                curveToRelative(-0.87f, 0.1f, -1.7f, 0.44f, -2.4f, 0.96f)
                lineTo(2f, 4.97f)
                curveToRelative(0f, -2.74f, 2.22f, -4.97f, 4.97f, -4.97f)
                horizontalLineToRelative(10.03f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(9.39f, 12.33f)
                curveToRelative(-0.25f, -1.22f, -0.35f, -2.47f, -0.39f, -3.33f)
                horizontalLineToRelative(-2.94f)
                curveToRelative(0.27f, 1.6f, 1.18f, 2.98f, 2.45f, 3.88f)
                curveToRelative(0.41f, 0.29f, 0.98f, -0.06f, 0.88f, -0.55f)
                close()
                moveTo(8.52f, 3.12f)
                curveToRelative(-1.27f, 0.9f, -2.18f, 2.28f, -2.45f, 3.88f)
                horizontalLineToRelative(2.94f)
                curveToRelative(0.04f, -0.86f, 0.14f, -2.12f, 0.39f, -3.33f)
                curveToRelative(0.1f, -0.49f, -0.47f, -0.84f, -0.88f, -0.55f)
                close()
                moveTo(12.95f, 9.0f)
                horizontalLineToRelative(-1.95f)
                curveToRelative(0.11f, 2.56f, 0.43f, 4.83f, 0.98f, 4.83f)
                reflectiveCurveToRelative(0.87f, -2.27f, 0.98f, -4.83f)
                close()
                moveTo(12.95f, 7.0f)
                curveToRelative(-0.11f, -2.56f, -0.42f, -4.83f, -0.98f, -4.83f)
                reflectiveCurveToRelative(-0.87f, 2.27f, -0.98f, 4.83f)
                horizontalLineToRelative(1.95f)
                close()
                moveTo(17.89f, 9.0f)
                horizontalLineToRelative(-2.94f)
                curveToRelative(-0.04f, 0.86f, -0.14f, 2.12f, -0.39f, 3.33f)
                curveToRelative(-0.1f, 0.49f, 0.47f, 0.84f, 0.88f, 0.55f)
                curveToRelative(1.27f, -0.9f, 2.18f, -2.28f, 2.45f, -3.88f)
                close()
                moveTo(17.89f, 7.0f)
                curveToRelative(-0.27f, -1.6f, -1.18f, -2.98f, -2.45f, -3.88f)
                curveToRelative(-0.41f, -0.29f, -0.98f, 0.06f, -0.88f, 0.55f)
                curveToRelative(0.25f, 1.22f, 0.35f, 2.47f, 0.39f, 3.33f)
                horizontalLineToRelative(2.94f)
                close()
            }
        }.also { _BookAtlas = it}
