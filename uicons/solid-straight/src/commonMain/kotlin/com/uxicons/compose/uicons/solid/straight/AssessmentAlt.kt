package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AssessmentAlt: ImageVector? = null

val Icons.Ss.AssessmentAlt: ImageVector
    get() = _AssessmentAlt ?: UXIcon(name = "AssessmentAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.09f, 20f)
                horizontalLineToRelative(-3.09f)
                reflectiveCurveToRelative(0f, -3.09f, 0f, -3.09f)
                lineToRelative(7.28f, -7.28f)
                curveToRelative(0.85f, -0.85f, 2.23f, -0.85f, 3.09f, 0f)
                horizontalLineToRelative(0f)
                curveToRelative(0.85f, 0.85f, 0.85f, 2.23f, 0f, 3.09f)
                lineToRelative(-7.28f, 7.28f)
                close()
                moveTo(12f, 6f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveTo(0f, 9.31f, 0f, 6f)
                reflectiveCurveTo(2.69f, 0f, 6f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(10.36f, 4.74f)
                lineToRelative(-1.4f, -1.43f)
                lineToRelative(-3.61f, 3.7f)
                lineToRelative(-2.22f, -2.3f)
                lineToRelative(-1.39f, 1.44f)
                lineToRelative(2.18f, 2.27f)
                curveToRelative(0.77f, 0.77f, 2.08f, 0.76f, 2.82f, 0.02f)
                lineToRelative(0.0f, -0.0f)
                lineToRelative(3.61f, -3.7f)
                close()
                moveTo(16.92f, 22f)
                horizontalLineToRelative(-5.91f)
                verticalLineToRelative(-5.91f)
                lineToRelative(7.86f, -7.86f)
                curveToRelative(0.46f, -0.46f, 0.99f, -0.77f, 1.57f, -0.97f)
                curveToRelative(-0.55f, -0.76f, -1.43f, -1.25f, -2.43f, -1.25f)
                horizontalLineToRelative(-4f)
                curveToRelative(0f, 4.42f, -3.58f, 8f, -8f, 8f)
                curveToRelative(-1.06f, 0f, -2.07f, -0.21f, -3f, -0.59f)
                verticalLineToRelative(10.59f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-6.08f)
                lineToRelative(-4.08f, 4.08f)
                close()
            }
        }.also { _AssessmentAlt = it}
