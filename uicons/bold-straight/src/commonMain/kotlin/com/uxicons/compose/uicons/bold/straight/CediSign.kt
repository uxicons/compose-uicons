package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CediSign: ImageVector? = null

val Icons.Bs.CediSign: ImageVector
    get() = _CediSign ?: UXIcon(name = "CediSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 18.94f)
                verticalLineTo(5.06f)
                curveToRelative(1.74f, 0.26f, 3.26f, 1.35f, 4.06f, 2.97f)
                lineToRelative(2.69f, -1.34f)
                curveToRelative(-1.32f, -2.65f, -3.85f, -4.38f, -6.75f, -4.66f)
                verticalLineTo(0f)
                horizontalLineToRelative(-3f)
                verticalLineTo(2.01f)
                curveToRelative(-4.45f, 0.24f, -8f, 3.93f, -8f, 8.44f)
                verticalLineToRelative(3.09f)
                curveToRelative(0f, 4.51f, 3.55f, 8.2f, 8f, 8.44f)
                verticalLineToRelative(2.01f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2.04f)
                curveToRelative(2.84f, -0.28f, 5.36f, -1.96f, 6.69f, -4.54f)
                lineToRelative(-2.67f, -1.38f)
                curveToRelative(-0.81f, 1.57f, -2.31f, 2.63f, -4.02f, 2.89f)
                close()
                moveTo(6f, 13.55f)
                verticalLineToRelative(-3.09f)
                curveToRelative(0f, -2.85f, 2.2f, -5.2f, 5f, -5.43f)
                verticalLineToRelative(13.96f)
                curveToRelative(-2.8f, -0.23f, -5f, -2.58f, -5f, -5.43f)
                close()
            }
        }.also { _CediSign = it}
