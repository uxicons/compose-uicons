package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CentSign: ImageVector? = null

val Icons.Bs.CentSign: ImageVector
    get() = _CentSign ?: UXIcon(name = "CentSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18.02f, 16.05f)
                lineToRelative(2.67f, 1.38f)
                curveToRelative(-1.33f, 2.58f, -3.84f, 4.26f, -6.69f, 4.54f)
                verticalLineToRelative(2.04f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2.01f)
                curveToRelative(-4.45f, -0.24f, -8f, -3.93f, -8f, -8.44f)
                verticalLineToRelative(-3.09f)
                curveTo(3f, 5.95f, 6.55f, 2.25f, 11f, 2.01f)
                verticalLineTo(0f)
                horizontalLineToRelative(3f)
                verticalLineTo(2.04f)
                curveToRelative(2.89f, 0.28f, 5.43f, 2.01f, 6.75f, 4.66f)
                lineToRelative(-2.69f, 1.34f)
                curveToRelative(-0.93f, -1.87f, -2.8f, -3.03f, -4.89f, -3.03f)
                horizontalLineToRelative(-1.72f)
                curveToRelative(-3.01f, 0f, -5.45f, 2.45f, -5.45f, 5.45f)
                verticalLineToRelative(3.09f)
                curveToRelative(0f, 3.01f, 2.45f, 5.45f, 5.45f, 5.45f)
                horizontalLineToRelative(1.72f)
                curveToRelative(2.05f, 0f, 3.91f, -1.13f, 4.85f, -2.95f)
                close()
            }
        }.also { _CentSign = it}
