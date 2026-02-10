package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VoiceNote: ImageVector? = null

val Icons.Ss.VoiceNote: ImageVector
    get() = _VoiceNote ?: UXIcon(name = "VoiceNote") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                horizontalLineToRelative(-18f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(6.44f)
                lineToRelative(4.09f, 3.44f)
                curveToRelative(0.42f, 0.37f, 0.95f, 0.56f, 1.47f, 0.56f)
                curveToRelative(0.52f, 0f, 1.03f, -0.18f, 1.43f, -0.54f)
                lineToRelative(4.19f, -3.46f)
                horizontalLineToRelative(6.38f)
                verticalLineToRelative(-17f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(13.5f, 10f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(9.88f, 7.88f)
                curveToRelative(-0.57f, 0.57f, -0.88f, 1.32f, -0.88f, 2.12f)
                reflectiveCurveToRelative(0.31f, 1.55f, 0.88f, 2.12f)
                lineToRelative(-1.41f, 1.41f)
                curveToRelative(-0.94f, -0.94f, -1.46f, -2.2f, -1.46f, -3.54f)
                reflectiveCurveToRelative(0.52f, -2.59f, 1.46f, -3.54f)
                close()
                moveTo(17f, 10f)
                curveToRelative(0f, 1.34f, -0.52f, 2.59f, -1.46f, 3.54f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(0.57f, -0.57f, 0.88f, -1.32f, 0.88f, -2.12f)
                reflectiveCurveToRelative(-0.31f, -1.55f, -0.88f, -2.12f)
                lineToRelative(1.41f, -1.41f)
                curveToRelative(0.94f, 0.94f, 1.46f, 2.2f, 1.46f, 3.54f)
                close()
                moveTo(5f, 10f)
                curveToRelative(0f, 1.87f, 0.73f, 3.63f, 2.05f, 4.95f)
                lineToRelative(-1.41f, 1.41f)
                curveToRelative(-1.7f, -1.7f, -2.64f, -3.96f, -2.64f, -6.36f)
                reflectiveCurveToRelative(0.94f, -4.66f, 2.64f, -6.36f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(-1.32f, 1.32f, -2.05f, 3.08f, -2.05f, 4.95f)
                close()
                moveTo(18.36f, 3.64f)
                curveToRelative(1.7f, 1.7f, 2.64f, 3.96f, 2.64f, 6.36f)
                reflectiveCurveToRelative(-0.94f, 4.67f, -2.64f, 6.36f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(1.32f, -1.32f, 2.05f, -3.08f, 2.05f, -4.95f)
                reflectiveCurveToRelative(-0.73f, -3.63f, -2.05f, -4.95f)
                close()
            }
        }.also { _VoiceNote = it}
