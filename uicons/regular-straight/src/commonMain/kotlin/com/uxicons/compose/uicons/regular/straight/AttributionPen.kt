package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AttributionPen: ImageVector? = null

val Icons.Rs.AttributionPen: ImageVector
    get() = _AttributionPen ?: UXIcon(name = "AttributionPen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15f, 17f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(3f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                lineTo(0f, 24f)
                verticalLineToRelative(-2f)
                lineTo(19f, 22f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveTo(10.55f, 17.5f)
                lineTo(0.04f, 19.96f)
                lineTo(2.5f, 9.45f)
                lineToRelative(5.55f, -1.74f)
                lineTo(14.88f, 0.88f)
                curveToRelative(1.13f, -1.13f, 3.11f, -1.13f, 4.24f, 0f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(0f, 0f, 0f, 0f)
                curveToRelative(0.57f, 0.57f, 0.88f, 1.32f, 0.88f, 2.12f)
                reflectiveCurveToRelative(-0.31f, 1.55f, -0.88f, 2.12f)
                lineToRelative(-6.83f, 6.83f)
                lineToRelative(-1.74f, 5.55f)
                close()
                moveTo(10f, 8.59f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(6.29f, -6.29f)
                curveToRelative(0.19f, -0.19f, 0.29f, -0.44f, 0.29f, -0.71f)
                reflectiveCurveToRelative(-0.1f, -0.52f, -0.29f, -0.71f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.38f, -0.38f, -1.04f, -0.38f, -1.41f, 0f)
                lineToRelative(-6.29f, 6.29f)
                close()
                moveTo(8.98f, 15.81f)
                lineToRelative(1.29f, -4.12f)
                lineToRelative(-1.97f, -1.97f)
                lineToRelative(-4.12f, 1.29f)
                lineToRelative(-1.03f, 4.41f)
                lineToRelative(2.86f, -2.86f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.86f, 2.86f)
                lineToRelative(4.41f, -1.03f)
                close()
            }
        }.also { _AttributionPen = it}
