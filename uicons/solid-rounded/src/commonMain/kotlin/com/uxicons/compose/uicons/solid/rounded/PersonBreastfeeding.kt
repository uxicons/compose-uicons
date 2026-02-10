package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonBreastfeeding: ImageVector? = null

val Icons.Sr.PersonBreastfeeding: ImageVector
    get() = _PersonBreastfeeding ?: UXIcon(name = "PersonBreastfeeding") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 12f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveTo(8.69f, 0f, 12f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(22.76f, 20.28f)
                curveToRelative(-1.65f, -3.75f, -5.98f, -6.28f, -10.76f, -6.28f)
                reflectiveCurveTo(2.9f, 16.52f, 1.24f, 20.28f)
                curveToRelative(-0.49f, 1.11f, -0.22f, 2.46f, 0.72f, 3.39f)
                lineToRelative(0.38f, 0.33f)
                lineTo(12.27f, 24f)
                lineToRelative(-2.49f, -1.91f)
                curveToRelative(-0.49f, -0.38f, -0.78f, -0.96f, -0.78f, -1.59f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(2.39f)
                lineToRelative(4.69f, 3.61f)
                horizontalLineToRelative(5.97f)
                lineToRelative(0.43f, -0.38f)
                curveToRelative(0.89f, -0.89f, 1.16f, -2.23f, 0.67f, -3.35f)
                close()
                moveTo(15.5f, 22f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }.also { _PersonBreastfeeding = it}
