package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenField: ImageVector? = null

val Icons.Ts.PenField: ImageVector
    get() = _PenField ?: UXIcon(name = "PenField") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 15f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveTo(8f, 16f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                close()
                moveTo(13f, 17f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveTo(15.54f, 12f)
                horizontalLineToRelative(-3.54f)
                verticalLineToRelative(-3.54f)
                lineTo(19.73f, 0.73f)
                curveToRelative(0.97f, -0.98f, 2.56f, -0.97f, 3.54f, 0f)
                curveToRelative(0.47f, 0.47f, 0.73f, 1.1f, 0.73f, 1.77f)
                reflectiveCurveToRelative(-0.26f, 1.3f, -0.73f, 1.77f)
                lineToRelative(-7.73f, 7.73f)
                close()
                moveTo(15.12f, 11f)
                lineToRelative(7.44f, -7.44f)
                curveToRelative(0.28f, -0.28f, 0.44f, -0.66f, 0.44f, -1.06f)
                reflectiveCurveToRelative(-0.16f, -0.78f, -0.44f, -1.06f)
                curveToRelative(-0.58f, -0.58f, -1.54f, -0.58f, -2.12f, 0f)
                lineToRelative(-7.44f, 7.44f)
                verticalLineToRelative(2.12f)
                horizontalLineToRelative(2.12f)
                close()
                moveTo(22.24f, 8.12f)
                lineToRelative(-0.88f, 0.88f)
                horizontalLineToRelative(0.14f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(11.5f)
                lineTo(1f, 22f)
                verticalLineToRelative(-11.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(-1f)
                lineTo(2.5f, 8f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(12.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-12.5f)
                curveToRelative(0f, -1.12f, -0.74f, -2.06f, -1.76f, -2.38f)
                close()
            }
        }.also { _PenField = it}
