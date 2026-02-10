package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AgeRestrictionTwentyOne: ImageVector? = null

val Icons.Ss.AgeRestrictionTwentyOne: ImageVector
    get() = _AgeRestrictionTwentyOne ?: UXIcon(name = "AgeRestrictionTwentyOne") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(10f, 15f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-1.25f)
                curveToRelative(0f, -2.26f, 4f, -3.25f, 4f, -5.75f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                curveToRelative(0f, 2.57f, -2.55f, 4.21f, -3.41f, 5f)
                horizontalLineToRelative(3.41f)
                close()
                moveTo(15f, 17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6.46f)
                lineToRelative(-0.52f, 0.57f)
                lineToRelative(-1.48f, -1.34f)
                lineToRelative(2.52f, -2.78f)
                horizontalLineToRelative(1.49f)
                verticalLineToRelative(10f)
                close()
                moveTo(20f, 13f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.also { _AgeRestrictionTwentyOne = it}
