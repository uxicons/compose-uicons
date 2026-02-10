package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ForeignLanguageAudio: ImageVector? = null

val Icons.Ss.ForeignLanguageAudio: ImageVector
    get() = _ForeignLanguageAudio ?: UXIcon(name = "ForeignLanguageAudio") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 5.99f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2.0f)
                verticalLineToRelative(8.01f)
                curveToRelative(0f, 1.1f, 0.9f, 2.0f, 2f, 2.0f)
                horizontalLineToRelative(2.8f)
                lineToRelative(7.2f, 5.99f)
                lineTo(12f, 0f)
                lineTo(4.8f, 5.99f)
                lineTo(2f, 5.99f)
                close()
                moveTo(22.91f, 10f)
                curveToRelative(-0.24f, 1.43f, -0.95f, 3.44f, -2.37f, 5.09f)
                curveToRelative(0.92f, 0.55f, 2.05f, 0.91f, 3.47f, 0.91f)
                verticalLineToRelative(2f)
                curveToRelative(-2.08f, 0f, -3.72f, -0.61f, -5.0f, -1.52f)
                curveToRelative(-1.28f, 0.91f, -2.92f, 1.52f, -5.0f, 1.52f)
                verticalLineToRelative(-2f)
                curveToRelative(1.42f, 0f, 2.56f, -0.35f, 3.48f, -0.9f)
                curveToRelative(-0.84f, -0.97f, -1.43f, -2.07f, -1.83f, -3.1f)
                horizontalLineToRelative(2.17f)
                curveToRelative(0.29f, 0.61f, 0.69f, 1.23f, 1.18f, 1.8f)
                curveToRelative(1.09f, -1.25f, 1.64f, -2.77f, 1.86f, -3.8f)
                horizontalLineToRelative(-6.86f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1.09f)
                close()
            }
        }.also { _ForeignLanguageAudio = it}
