package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AgeRestrictionSixteen: ImageVector? = null

val Icons.Ss.AgeRestrictionSixteen: ImageVector
    get() = _AgeRestrictionSixteen ?: UXIcon(name = "AgeRestrictionSixteen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 13.75f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(6f, 7f)
                horizontalLineToRelative(-1.49f)
                lineToRelative(-2.52f, 2.78f)
                lineToRelative(1.48f, 1.34f)
                lineToRelative(0.52f, -0.58f)
                verticalLineToRelative(6.46f)
                horizontalLineToRelative(2f)
                lineTo(6.0f, 7f)
                close()
                moveTo(15f, 13.75f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-0.53f, 0f, -1.03f, 0.13f, -1.48f, 0.34f)
                curveToRelative(0.08f, -1.03f, 0.94f, -1.84f, 1.98f, -1.84f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(0.05f)
                curveToRelative(0.24f, 1.69f, 1.69f, 3f, 3.45f, 3f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                close()
                moveTo(22f, 13f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
            }
        }.also { _AgeRestrictionSixteen = it}
