package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AssessmentAlt: ImageVector? = null

val Icons.Bs.AssessmentAlt: ImageVector
    get() = _AssessmentAlt ?: UXIcon(name = "AssessmentAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.09f, 9f)
                horizontalLineToRelative(-3.67f)
                curveToRelative(0.38f, -0.93f, 0.59f, -1.94f, 0.59f, -3f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.77f, 0f, 1.47f, 0.26f, 2.05f, 0.67f)
                curveToRelative(-0.24f, 0.16f, -0.47f, 0.34f, -0.69f, 0.55f)
                lineToRelative(-1.77f, 1.77f)
                close()
                moveTo(18f, 21f)
                lineTo(6f, 21f)
                verticalLineToRelative(-7f)
                curveToRelative(-1.06f, 0f, -2.07f, -0.21f, -3f, -0.59f)
                verticalLineToRelative(10.59f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-7.09f)
                lineToRelative(-3f, 3f)
                verticalLineToRelative(1.09f)
                close()
                moveTo(23.36f, 8.64f)
                curveToRelative(-0.85f, -0.85f, -2.23f, -0.85f, -3.09f, 0f)
                lineToRelative(-7.28f, 7.28f)
                verticalLineToRelative(3.09f)
                horizontalLineToRelative(3.09f)
                lineToRelative(7.28f, -7.28f)
                curveToRelative(0.85f, -0.85f, 0.85f, -2.23f, 0f, -3.09f)
                close()
                moveTo(6f, 12f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveTo(2.69f, 0f, 6f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(6.75f, 8.44f)
                lineToRelative(0.0f, -0.0f)
                lineToRelative(3.61f, -3.7f)
                lineToRelative(-1.4f, -1.43f)
                lineToRelative(-3.61f, 3.7f)
                lineToRelative(-2.22f, -2.3f)
                lineToRelative(-1.39f, 1.44f)
                lineToRelative(2.18f, 2.27f)
                curveToRelative(0.77f, 0.77f, 2.08f, 0.76f, 2.82f, 0.02f)
                close()
            }
        }.also { _AssessmentAlt = it}
