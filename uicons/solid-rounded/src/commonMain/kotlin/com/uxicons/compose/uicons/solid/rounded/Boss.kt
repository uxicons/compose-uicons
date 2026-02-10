package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Boss: ImageVector? = null

val Icons.Sr.Boss: ImageVector
    get() = _Boss ?: UXIcon(name = "Boss") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 10f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                reflectiveCurveTo(14.76f, 0f, 12f, 0f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                close()
                moveTo(14.41f, 11.38f)
                curveToRelative(2.64f, 0.84f, 4.69f, 3.01f, 5.35f, 5.72f)
                curveToRelative(0.11f, 0.45f, -0.23f, 0.9f, -0.7f, 0.9f)
                horizontalLineToRelative(-5.35f)
                lineToRelative(-1.12f, -3.9f)
                lineToRelative(1.82f, -2.72f)
                close()
                moveTo(4.23f, 17.1f)
                curveToRelative(0.66f, -2.71f, 2.71f, -4.88f, 5.35f, -5.72f)
                lineToRelative(1.82f, 2.72f)
                lineToRelative(-1.12f, 3.9f)
                horizontalLineToRelative(-5.35f)
                curveToRelative(-0.47f, 0f, -0.81f, -0.44f, -0.7f, -0.9f)
                close()
                moveTo(24f, 21f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(3f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(22f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _Boss = it}
