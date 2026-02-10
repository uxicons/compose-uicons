package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SurveyXmark: ImageVector? = null

val Icons.Ss.SurveyXmark: ImageVector
    get() = _SurveyXmark ?: UXIcon(name = "SurveyXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.83f, 2f)
                curveToRelative(-0.41f, -1.16f, -1.52f, -2f, -2.83f, -2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.3f, 0f, -2.42f, 0.84f, -2.83f, 2f)
                lineTo(3f, 2f)
                lineTo(3f, 21f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(12f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(21f, 2f)
                horizontalLineToRelative(-5.17f)
                close()
                moveTo(11.63f, 18.29f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-1.25f, -1.25f)
                lineToRelative(-1.25f, 1.25f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.25f, -1.25f)
                lineToRelative(-1.25f, -1.25f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.25f, 1.25f)
                lineToRelative(1.25f, -1.25f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.25f, 1.25f)
                lineToRelative(1.25f, 1.25f)
                close()
                moveTo(11.63f, 11.29f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-1.25f, -1.25f)
                lineToRelative(-1.25f, 1.25f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.25f, -1.25f)
                lineToRelative(-1.25f, -1.25f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(1.25f, 1.25f)
                lineToRelative(1.25f, -1.25f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-1.25f, 1.25f)
                lineToRelative(1.25f, 1.25f)
                close()
                moveTo(18f, 18f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                close()
                moveTo(18f, 11f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _SurveyXmark = it}
