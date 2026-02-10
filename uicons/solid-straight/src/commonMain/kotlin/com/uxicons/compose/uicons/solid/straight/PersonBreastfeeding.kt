package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonBreastfeeding: ImageVector? = null

val Icons.Ss.PersonBreastfeeding: ImageVector
    get() = _PersonBreastfeeding ?: UXIcon(name = "PersonBreastfeeding") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 12f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveTo(8.69f, 0f, 12f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(20.8f, 17.07f)
                curveToRelative(-1.06f, -1.89f, -3.07f, -3.07f, -5.23f, -3.07f)
                horizontalLineToRelative(-7.14f)
                curveToRelative(-2.17f, 0f, -4.17f, 1.18f, -5.23f, 3.07f)
                lineToRelative(-2.19f, 4.81f)
                verticalLineToRelative(1.29f)
                lineToRelative(1.24f, 0.83f)
                lineTo(12.27f, 24f)
                lineToRelative(-3.27f, -2.45f)
                verticalLineToRelative(-4.55f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3.45f)
                lineToRelative(4.69f, 3.55f)
                horizontalLineToRelative(6.07f)
                lineToRelative(1.24f, -0.83f)
                verticalLineToRelative(-1.29f)
                lineToRelative(-2.19f, -4.81f)
                close()
                moveTo(15.5f, 22f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }.also { _PersonBreastfeeding = it}
