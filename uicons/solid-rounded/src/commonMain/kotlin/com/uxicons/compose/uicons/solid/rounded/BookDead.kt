package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookDead: ImageVector? = null

val Icons.Sr.BookDead: ImageVector
    get() = _BookDead ?: UXIcon(name = "BookDead") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 8f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(1.98f, 21f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                horizontalLineToRelative(12f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-1f)
                lineTo(4.98f, 18f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                close()
                moveTo(10f, 7f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(21.98f, 5f)
                verticalLineToRelative(11f)
                lineTo(4.98f, 16f)
                curveToRelative(-0.2f, 0f, -0.41f, 0.02f, -0.6f, 0.06f)
                curveToRelative(-0.87f, 0.1f, -1.7f, 0.44f, -2.4f, 0.96f)
                lineTo(1.98f, 4.97f)
                curveToRelative(0f, -2.74f, 2.22f, -4.97f, 4.97f, -4.97f)
                horizontalLineToRelative(10.03f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(16.46f, 9.49f)
                curveToRelative(-0.01f, -0.77f, -0.01f, -1.63f, -0.01f, -2.04f)
                curveToRelative(0f, -2.61f, -2.26f, -4.7f, -4.92f, -4.42f)
                curveToRelative(-2.33f, 0.24f, -4.02f, 2.35f, -4.02f, 4.69f)
                verticalLineToRelative(1.79f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(0.96f)
                curveToRelative(0.83f, 0f, 1.51f, -0.68f, 1.5f, -1.51f)
                close()
            }
        }.also { _BookDead = it}
