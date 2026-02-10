package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonDotsFromLine: ImageVector? = null

val Icons.Sr.PersonDotsFromLine: ImageVector
    get() = _PersonDotsFromLine ?: UXIcon(name = "PersonDotsFromLine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 10f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(2.5f, 5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(23f, 22f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-6.94f)
                curveToRelative(0.52f, 0.21f, 1.03f, 0.44f, 1.52f, 0.71f)
                lineToRelative(3.0f, 1.62f)
                curveToRelative(0.48f, 0.26f, 1.09f, 0.08f, 1.35f, -0.41f)
                curveToRelative(0.26f, -0.49f, 0.08f, -1.09f, -0.41f, -1.35f)
                lineToRelative(-3.0f, -1.62f)
                curveToRelative(-2.44f, -1.31f, -5.18f, -2.0f, -7.95f, -2.0f)
                horizontalLineToRelative(-1.05f)
                curveToRelative(-2.76f, 0f, -5.51f, 0.69f, -7.95f, 2.0f)
                lineToRelative(-3.0f, 1.62f)
                curveToRelative(-0.49f, 0.26f, -0.67f, 0.87f, -0.41f, 1.35f)
                reflectiveCurveToRelative(0.87f, 0.67f, 1.35f, 0.41f)
                lineToRelative(3.0f, -1.62f)
                curveToRelative(0.49f, -0.27f, 1.0f, -0.5f, 1.52f, -0.71f)
                verticalLineToRelative(6.94f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(22f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(12.5f, 19f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(21.5f, 7f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _PersonDotsFromLine = it}
